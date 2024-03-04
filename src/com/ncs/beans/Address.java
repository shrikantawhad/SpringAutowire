package com.ncs.beans;

public class Address {
	private int houseNo;
	private String city;
	private int pinCode;

	public void setHouseNo(int houseNo) {
		//System.out.println("Setter Method HouseNo");
		this.houseNo = houseNo;
	}

	public void setCity(String city) {
		//System.out.println("Setter Method City");
		this.city = city;
	}

	public void setPinCode(int pinCode) {
		//System.out.println("Setter Method PinCode");
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "#" + houseNo + ", " + city + " - " + pinCode;
	}
}
