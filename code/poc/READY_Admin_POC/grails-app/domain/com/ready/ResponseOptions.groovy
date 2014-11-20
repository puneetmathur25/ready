package com.ready

class ResponseOptions {

	String name
	String value
	
    static constraints = {
    }
	 
	String toString() {
		return name + " (" + value + ")"
	}
}
