package com.ibm.model;

public class Address {

	private int addressId;
	private String street;
	private String city;
	private String zipcode;
	private Persion persion;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Persion getPersion() {
		return persion;
	}

	public void setPersion(Persion persion) {
		this.persion = persion;
	}

}
