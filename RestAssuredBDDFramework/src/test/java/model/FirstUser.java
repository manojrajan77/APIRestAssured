package model;

public class FirstUser {
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getAddressObject() {
		return AddressObject;
	}
	public void setAddressObject(Address addressObject) {
		AddressObject = addressObject;
	}
	private String firstName;
	private String lastName;
	Address AddressObject;
	
}
