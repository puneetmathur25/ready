package com.ready

class ResponseOption {

	String name
	String value
	
    static constraints = {
    }
	 
	String toString() {
		return name + " (" + value + ")"
	}
}
