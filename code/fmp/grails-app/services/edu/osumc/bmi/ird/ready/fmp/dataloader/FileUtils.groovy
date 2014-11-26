package edu.osumc.bmi.ird.ready.fmp.dataloader

import groovy.io.FileType

class FileUtils {

	def static unzipFile(fileName, destination) {
		def ant = new AntBuilder()
		def zipFile = new File(fileName)
		this.log.info 'Beginning Unzip of ' + fileName
		ant.unzip(  src: fileName, dest:destination,  overwrite:"true")
		this.log.info 'Finished Unzip of ' + fileName
	}
	
	def static List<File> getFiles(directory) {
		def list = []

		def dir = new File(directory)
		if (dir.exists()) {
			dir.eachFileRecurse (FileType.FILES) { file ->  
				if (file) {
					list << file
				}
			}
		}
		return list;
	}
	
	def static getFile(directory, regex) {
		def dataFile

		def dir = new File(directory)
		dir.eachFileRecurse (FileType.FILES) { file ->
			def name = file.name
			if (name =~ regex)
				dataFile = file
				}
		this.log.info 'Date File retreived: ' + dataFile.name
		return dataFile;
	}
	
	def static writeFile(File sourceFile, destinationFile, contentPattern) {
		def outFile = new FileOutputStream(destinationFile)
		def out = new BufferedOutputStream(outFile)
		this.log.info 'Writing Pattern File to ' + destinationFile
		sourceFile.eachLine { String l ->
		  if(l.matches(contentPattern)) {
			  out << l + "\n"
		  }
		}
		this.log.info 'Completed writing file: ' + destinationFile
		out.close()
//		outFile.close
	}
	
	def static deleteFiles(directory) {
		this.log.info 'Deleting direcory: ' + directory
		def dir = new File(directory)
		return dir.deleteDir()
	}
}
