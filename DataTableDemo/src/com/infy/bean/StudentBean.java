	
	package com.infy.bean;
	
	import java.util.ArrayList;
	/**
	 * This class is backing bean for studentData.jsp
	 */
	public class StudentBean {
	private ArrayList <Student> studList 
	= new ArrayList<Student>();
	
	public ArrayList<Student> getStudList() {
		return studList;
	}
	
	public void setStudList(ArrayList<Student> studList) {
		this.studList = studList;
	}
	// This is default constructor which populates studList with Student objects.
	public StudentBean(){
		studList.add(new Student("Sachin","A"));
		studList.add(new Student("Rahul","B"));
		studList.add(new Student("Nishant","A+"));
	}
	}

	
	