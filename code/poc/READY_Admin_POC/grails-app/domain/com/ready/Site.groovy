package com.ready

class Site {

	String siteUserId
	String password
	
	static hasMany = [physicians : Physician, configProfiles : ConfigProfile]
    static constraints = {
    }
}