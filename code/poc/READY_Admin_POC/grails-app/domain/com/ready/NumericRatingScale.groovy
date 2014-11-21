package com.ready

class NumericRatingScale extends ResponseType {
	
	String minLevelLabel
	String minLevelValue
	String maxLevelLabel
	String maxLevelValue
	float increment

    static constraints = {
    }
	
	String toString() {
		return minLevelLabel + " (" + minLevelValue + ") - " + maxLevelLabel + " (" + maxLevelValue + ")"
	}
}
