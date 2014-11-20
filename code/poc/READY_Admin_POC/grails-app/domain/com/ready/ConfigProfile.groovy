package com.ready

class ConfigProfile {
	
	String name;
	Boolean saveResults
	String greeting
	
//	Map<Instrument, List<Diagnosis>> instrumentDiagnosisMap

	 static belongsTo = Site
	static hasMany = [sites : Site, instruments : Instrument]
	
    static constraints = {
    }
	
	String toString() {
		return name
	}
}
