package com.ready

class Question {

	String questionString
	ResponseType responseType
	
	static constraints = {
		responseType unique: true
    }
	
	String toString() {
		return questionString
	}
}
