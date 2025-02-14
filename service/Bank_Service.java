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
		System.out.println("Enter mobile Number");
		u.setmNo(sc.nextLong());
		System.out.println("Enter Account number...");
		u.setAcc_no(sc.nextLong());
		System.out.println("Enter User Balance...");
		u.setAcc_balance(sc.nextDouble());
		return;
	}
	public void getdetails() {
		System.out.println("User ID : "+u.getUid());
		System.out.println("User Name :"+u.getUname());
		System.out.println("User Adderss : "+u.getAddress());
		System.out.println("User Mobile Number :"+u.getmNo());
		System.out.println("User Account Number :"+u.getAcc_no());
		System.out.println("User Account Balance :"+u.getAcc_balance());
	}
}
