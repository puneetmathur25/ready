package com.ready

class Response {

	String name
	String value
	
    static constraints = {
    }
	 
	String toString() {
		return name + " (" + value + ")"
	}
}
