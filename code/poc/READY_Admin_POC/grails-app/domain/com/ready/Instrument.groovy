package com.ready

class Instrument {
	
	String name
	
	static belongsTo = Diagnosis
	static hasMany = [questions : Question, diagnoses : Diagnosis]

    static constraints = {
    }
	
	String toString() {
		return name
	}
}
