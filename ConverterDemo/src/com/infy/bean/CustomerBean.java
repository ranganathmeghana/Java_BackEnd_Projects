package com.infy.bean;

import java.util.Date;

/**
 * This is backing bean for standardConverter.jsp
 */

public class CustomerBean {

	private Date doj;
	private Date dob;

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}
	
	
	
	//This is action handler method.
	public String display(){
		return "success";
	}

}


