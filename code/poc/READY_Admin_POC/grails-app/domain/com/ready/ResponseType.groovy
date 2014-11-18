package com.ready

class ResponseType {

	String name
	
    static constraints = {
		
    }
	
	static hasMany = [responseOptions : Response]
	
	String toString() {
		return name
	}
}
