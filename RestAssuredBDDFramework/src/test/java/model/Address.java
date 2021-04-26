package model;

public class Address {
	
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public float getPhone() {
		return phone;
	}
	public void setPhone(float phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address(String streetAddress, float phone, String email) {
		this.streetAddress = streetAddress;
		this.phone = phone;
		this.email = email;
	}
	public Address() {
		// TODO Auto-generated constructor stub
	}
	private String streetAddress;
	private float phone;
	private String email;

}
