package com.ready

class Diagnosis {
	
	String name
	
	static hasMany = [instruments : Instrument]

    static constraints = {
    }
}
