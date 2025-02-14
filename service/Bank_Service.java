package com.service;

import java.util.Scanner;

import com.model.User;

public class Bank_Service {
	Scanner sc=new Scanner(System.in);
	User u=new User();
	
	public void registerUser() {
		System.out.println("Enter User Id...");
		u.setUid(sc.nextInt());
		System.out.println("Enter User Name...");
		u.setUname(sc.next() + sc.nextLine());
		System.out.println("Enter User Address...");
		u.setAddress(sc.next() + sc.nextLine());
		System.out.println("Enter Account number...");
		u.setAcc_no(sc.nextLong());
		System.out.println("Enter User Balance...");
		u.setAcc_balance(sc.nextDouble());
		return;
		
	}
}
