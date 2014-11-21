package com.ready

class Physician {
	
	String firstName
	String lastName
	String city
	String state
	String npi
	
	static belongsTo = Site
	static hasMany = [sites : Site]

    static constraints = {
    }
	
	String toString() {
		return firstName + " " + lastName
	}
}
