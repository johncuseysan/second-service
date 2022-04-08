package org.cusey.john.dto;

public class BackErrors {
	
	public String staus;								    		//2
	public String details;		    								//3
	
	public String getStaus() {
		return staus;
	}
	public void setStaus(String staus) {
		this.staus = staus;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	@Override
	public String toString() {
		return "BackErrors [staus=" + staus + ", details=" + details + "]";
	}

}
