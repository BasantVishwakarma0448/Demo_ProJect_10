package com.rays.forms;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseForm;

public class UserRegistrationForm extends BaseForm {

	@NotEmpty(message = "First Name Is Required")
	@Pattern(regexp = "^[^-\\s][\\p{L} .'-]+$", message = "First Name Contains Alphabets only")
	private String firstName;

	@NotEmpty(message = "Last Name Is Required")
	@Pattern(regexp = "^[^-\\s][\\p{L} .'-]+$", message = "Last Name Contains Alphabets only")
	private String lastName;

	@NotEmpty(message = "Valid Email Is Required")
	@Email
	private String loginId;

	@NotEmpty(message = "Password Is Required")
	@Pattern(regexp = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,12}", message = "Password contain 8 letters with alpha-numeric & special Character")
	private String password;

	@NotEmpty(message = "Gender Is Required")
	private String gender;

	@NotNull(message = "DOB Is Required")
	private Date dob;

	@NotEmpty(message = "Phone Is Required")
	@Pattern(regexp = "^[6-9][0-9]{9}$", message = "Mobile No. must have 10 Digit And only start with 6, 7, 8, 9")
	private String phone;

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

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "UserRegistrationForm [fristName=" + firstName + ", lastName=" + lastName + ", login=" + loginId
				+ ", password=" + password + ", gender=" + gender + ", dob=" + dob + ", phone=" + phone + "]";
	}

}
