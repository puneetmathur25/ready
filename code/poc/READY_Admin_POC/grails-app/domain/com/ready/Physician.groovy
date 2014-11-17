package com.ready

class Physician {
	
	String physicianName
	
	static belongsTo = Site
	static hasMany = [sites : Site]

    static constraints = {
    }
	
	String toString() {
		return physicianName
	}
}
