package com.ready

class ConfigProfile {
	
	String name;
//	Map<Instrument, List<Diagnosis>> instrumentDiagnosisMap

	 static belongsTo = Site
	static hasMany = [sites : Site, instruments : Instrument]
	
    static constraints = {
    }
	
	String toString() {
		return name
	}
}
