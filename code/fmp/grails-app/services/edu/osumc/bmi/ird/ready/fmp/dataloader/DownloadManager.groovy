package edu.osumc.bmi.ird.ready.fmp.dataloader

class DownloadManager {
	
	def webpage
	def directory
	def regex
	def currentFilePath
	
	def DownloadManager(webpage, linkRegex, directory) {
		this.webpage = webpage
		this.directory = directory
		this.regex = linkRegex
		// Get current zip file if exists
		def list = FileUtils.getFiles(directory)
		list.each { file ->
			if (file.name =~ ~/NPPES_Data_Dissemination(\w*)[^Weekly]\.zip/) {
				currentFilePath = file.path
			}
		}
	}
	
	def newDownload() {
		def link = getLink()
		def file
		if (link) {
			if (!isCurrentFile(getFileName(link))) {
				log.info 'Downloading new file: ' + link
				file = saveFile(link)
			}
		} else {
			log.info 'Unable to locate NPPES download link.'
		}
		return file
	}
	
	def getCurrentFilePath() {
		return currentFilePath
	}
	
	private def getLink() {
		log.info 'Checking ' + webpage + ' for new link'
		def data = new URL(webpage).getText()
		def link
		if(data) {
			log.info 'Website pull successful'
			link = data.find(regex)
			log.info 'NPPES Zip file located: ' + link
		}
		return link
	}
	
	private def getFileName(link) {
		def array = link.split('/')
		log.info 'File name is: ' + array
		return array[array.size() - 1]
	}
	
	private def isCurrentFile(fileName) {
		log.info 'Current file: ' + currentFilePath
		log.info 'Checking if current file: ' + directory + fileName
		def newFilePath = directory + fileName
		if (newFilePath.equals(currentFilePath)) {
			log.info 'Current file exists: ' + currentFilePath
			return true
		}
		return
	}
	
	private def saveFile(link) {
		if (!new File(directory).exists()) {
			log.info 'Create directory: ' + directory
			new File(directory).mkdir()
		}
		def file = new FileOutputStream(directory + link.tokenize("/")[-1])
		def out = new BufferedOutputStream(file)
		log.info 'Writing out file: ' + directory + link.tokenize("/")[-1]
		out << new URL(link).openStream()
		log.info 'Finished writing file: ' + directory + link.tokenize("/")[-1]
		out.close()
		currentFilePath = directory + link.tokenize("/")[-1]
		return currentFilePath
	}
}
