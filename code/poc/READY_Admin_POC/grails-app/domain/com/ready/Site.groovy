package com.ready

class Site {

	String siteUserId
	String password
	String greeting
	ConfigProfile defaultConfigProfile
	
	static belongsTo = [institution : Institution]
	static hasMany = [physicians : Physician, configProfiles : ConfigProfile]
    static constraints = {
    }
	
	String toString() {
		return siteUserId
	}
}