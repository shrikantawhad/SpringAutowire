package com.ncs.beans;

public class Student {
	private String name;
	private int rollNo;
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		//System.out.println("Setter Method Name");
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		//System.out.println("Setter Method RollNO");
		this.rollNo = rollNo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		//System.out.println("Setter Method Address");
		this.address = address;
	}
	
	public void display() {
		System.out.println("RollNo: "+rollNo);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
	}
}
