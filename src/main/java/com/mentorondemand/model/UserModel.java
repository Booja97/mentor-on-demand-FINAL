package com.mentorondemand.model;

public class UserModel {

	private long userId;

	private String userName;

	private String password;

	private String firstName;

	private String lastName;

	private String gender;

	private String email;

	private String contactNumber;

	private String regcode;

	private String activeStatus;

	private String address;

	private String role;

	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserModel(String userName, String password, String firstName, String lastName, String gender, String email,
			String contactNumber, String regcode, String activeStatus, String address, String role) {
		super();
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.email = email;
		this.contactNumber = contactNumber;
		this.regcode = regcode;
		this.activeStatus = activeStatus;
		this.address = address;
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getRegcode() {
		return regcode;
	}

	public void setRegcode(String regcode) {
		this.regcode = regcode;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + ", gender=" + gender + ", email=" + email + ", contactNumber="
				+ contactNumber + ", regcode=" + regcode + ", activeStatus=" + activeStatus + ", address=" + address
				+ "]";
	}

}
