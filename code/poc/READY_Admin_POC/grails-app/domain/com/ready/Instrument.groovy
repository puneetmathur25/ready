package com.ready

class Instrument {
	
	String name
	
	static hasMany = [questions : Question]
//	static belongsTo = [diagnosis : Diagnosis]

    static constraints = {
    }
	
	String toString() {
		return name
	}
}
