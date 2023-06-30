package com.pnc.constructor;

public class Student {
	public String name;
	public int rollNo;
	public String address;
	public int standard;
	
	public static final String schoolName = "Harrison Middle School";
	public static final int schoolId = 1952;
	
	public Student(String name, int rollNo, String adress,int standard){
		this.name = name;
		this.rollNo = rollNo;
		this.address = adress;
		this.standard = standard;
		
		
	}
	
	public void disp() {
		System.out.println("Name: " + name + "; Roll Number: " + rollNo + "; Adress: " + address + "; Grade: " + standard + "; School Name: " + Student.schoolName + "; School Id: " + Student.schoolId);
	}
}
