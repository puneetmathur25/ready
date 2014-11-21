package com.ready

class LikertScale extends ResponseType{
	
    static constraints = {
    }
	
	static hasMany = [responseOptions : ResponseOption]
}
