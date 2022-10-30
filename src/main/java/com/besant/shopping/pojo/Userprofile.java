package com.besant.shopping.pojo;

public class Userprofile {
	private String name;
	private String userId;
	private String email;
	private String psw;
	private Long phone;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = Long.valueOf(phone);
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Userprofile [name=" + name + ", userId=" + userId + ", email=" + email + ", psw=" + psw + ", phone="
				+ phone + ", address=" + address + "]";
	}
	
	
}
