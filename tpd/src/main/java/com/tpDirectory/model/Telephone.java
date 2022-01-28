package com.tpDirectory.model;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



@Entity
@Table(name="telephone")
public class Telephone {

	@Id
	private Long id;
	
	@NotBlank(message = "mobileNumber is required")
	@Size(min = 10, max = 10, message="Enter a valid Phone number")
	private String phone;
	
	@Size(min=4 , message="Name Should have atleast 2 characters")
	private String name;
	
	@NotBlank(message="Email should not be blank !!")
	private String email;
	
	private String city;
	@Size(min=6,max=6, message="Enter a Valid pincode of 6 digit")
	private String pincode;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Telephone [id=" + id + ", phone=" + phone + ", name=" + name + ", email=" + email + ", city=" + city
				+ ", pincode=" + pincode + ", getId()=" + getId() + ", getPhone()=" + getPhone() + ", getName()="
				+ getName() + ", getEmail()=" + getEmail() + ", getCity()=" + getCity() + ", getPincode()="
				+ getPincode() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	
}
