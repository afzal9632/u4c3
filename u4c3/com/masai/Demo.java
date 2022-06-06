package com.masai;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name:");
		String user = sc.next();
		
		System.out.println("Enter your password");
		String password = sc.next();
		
		System.out.println("Enter your mobile number:");
		String mobile = sc.next();
		
		System.out.println("Enter your email");
		String email = sc.next();
		
		
		char first = mobile.charAt(0);
		
		if(user.length()>=3 && user.length()<=8 && password.length()>=3 && password.length()<=8 && mobile.length()==10 && first == '6' || first == '7' || first == '8' || first == '9')
		{
				Q4 cred = new Q4(user,password,mobile,email);
				
				cred.showDetails();
		}
		else
		{
			System.out.println("Please enter valid credencials");
		}
	}

}
