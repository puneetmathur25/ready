package edu.osumc.bmi.ird.ready.fmp.dataloader

import grails.transaction.Transactional

@Transactional
class NppesService {

	def static webpage = "http://nppes.viva-it.com/NPI_Files.html"
	def static linkRegex = ~/http:\/\/nppes.viva-it.com\/NPPES_Data_Dissemination(\w*)[^Weekly]\.zip/
	
	static def dataFileLocation = 'data/ra_providers.csv'
	static def downloadFolder ='download/'
	static def destinationFolder = 'download/unzipped'
	
	static def dataFileRegex = ~/npidata(.*)[^FileHeader]\.csv/
	static def raContentMatch = ~/(.*)207RR0500X(.*)/
	def DownloadManager downloadManager
	
	def NppesService() {
		new File('data').mkdir()
		downloadManager = new DownloadManager(webpage, linkRegex, downloadFolder)
	}
	
	def start() {	
		def zipFile = downloadManager.newDownload()
		if (zipFile) {
			log.info 'New file to unzip! ' + zipFile
			FileUtils.unzipFile(zipFile, destinationFolder)
			def dataFile = FileUtils.getFile(destinationFolder, dataFileRegex)
			FileUtils.writeFile(dataFile, dataFileLocation, raContentMatch)
			ProviderLoader.loadDataFromFile(dataFileLocation)
			FileUtils.deleteFiles(downloadFolder)
		} else {
			// Do Nothing
			log.info 'No new file to download'
		}
	}
	
	def writeToDB() {
			log.info 'Writing Provider to local DB'  
			ProviderLoader.loadDataFromFile(dataFileLocation)
			log.info 'DB upload complete'
	}
	
}
