package com.mentorondemand.model;

public class MentorModel {

	private long mentorId;

	private String userName;

	private String email;

	private String password;

	private String contactNumber;

	private String linkedInUrl;

	private String regDateTime;

	private String skills;

	private String role = "mentor";

	public MentorModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MentorModel(String userName, String email, String password, String contactNumber, String linkedInUrl,
			String regDateTime, String skills, String role) {
		super();

		this.userName = userName;
		this.email = email;
		this.password = password;
		this.contactNumber = contactNumber;
		this.linkedInUrl = linkedInUrl;
		this.regDateTime = regDateTime;
		this.skills = skills;
		this.role = role;
	}

	public long getMentorId() {
		return mentorId;
	}

	public void setMentorId(long mentorId) {
		this.mentorId = mentorId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getLinkedInUrl() {
		return linkedInUrl;
	}

	public void setLinkedInUrl(String linkedInUrl) {
		this.linkedInUrl = linkedInUrl;
	}

	public String getRegDateTime() {
		return regDateTime;
	}

	public void setRegDateTime(String regDateTime) {
		this.regDateTime = regDateTime;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Mentor [mentorId=" + mentorId + ", userName=" + userName + ", email=" + email + ", password=" + password
				+ ", contactNumber=" + contactNumber + ", linkedInUrl=" + linkedInUrl + ", regDateTime=" + regDateTime
				+ ", skills=" + skills + ", role=" + role + "]";
	}

}
