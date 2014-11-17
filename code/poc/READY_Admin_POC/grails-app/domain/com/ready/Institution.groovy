package com.ready

class Institution {
	
	String name
	String streetAddress1
	String streetAddress2
	String city
	String state
	String country
	

    static constraints = {
    }
	
	String toString() {
		return name
	}
}
