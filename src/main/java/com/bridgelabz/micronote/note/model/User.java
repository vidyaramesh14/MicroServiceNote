package com.bridgelabz.micronote.note.model;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class User {
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String mobileNumber;
	private String password;
	private String confirmPassword;
	private boolean isVerification;
	private LocalDateTime created_date;
	private String ProfileImage;
	public String getProfileImage() {
		return ProfileImage;
	}
	public void setProfileImage(String profileImage) {
		ProfileImage = profileImage;
	}	
	
	public boolean isVerification() {
		return isVerification;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public void setVerification(boolean isVerification) {
		this.isVerification = isVerification;
	}
	public LocalDateTime getCreated_date() {

		return created_date;
	}
	public void setCreated_date(LocalDateTime created_date) {
		this.created_date = created_date;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String name) {
		this.firstName = name;
	}
	public void setLastName(String name) {
		this.lastName = name;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
}
