package com.masai;

public class Q4 {
	
	private String username;
	private String password;
	private String mobileNumber;
	private String email;
	
	public Q4()
	{};
	
	public 
	Q4(String username, String password, String mobileNumber, String email)
	{
		this.username = username;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}
	
	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getMobileNumber() {
		return mobileNumber;
	}



	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}
	
	public void showDetails()
	{
		System.out.println("UserName is :" + this.username);
		System.out.println("Password is :" + this.password);
		System.out.println("MobileNumber is :" + this.mobileNumber);
		System.out.println("Email is :" + this.email);
	}



	public static void main(String[] args) {
		

	}

}
