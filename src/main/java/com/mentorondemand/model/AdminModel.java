package com.mentorondemand.model;

public class AdminModel {
	
	
	private long adminId;
	private String name;

	private String email;
	
	private String password;
	
	private String contact;
	
	private String status;
	
	private String role="admin";
	
	public AdminModel() {
		
		}
	
	public AdminModel( String name, String email, String password, String contact, String status, String role) {
		
		
		this.name = name;
		this.email = email;
		this.password = password;
		this.contact = contact;
		this.status = status;
		this.role = role;
	}
	
	
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public long getAdminId() {
		return adminId;
	}
	public void setAdminId(long adminId) {
		this.adminId = adminId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", contact=" + contact + ", status=" + status + ", role=" + role + "]";
	}
	
}
