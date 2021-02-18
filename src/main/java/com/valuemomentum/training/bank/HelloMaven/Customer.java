package com.valuemomentum.training.bank.HelloMaven;

public class Customer {
	int accNo;
	String name;
	double balance;
	
	public Customer(int accNo2, String name2, int balance2) {
		// TODO Auto-generated constructor stub
		this.accNo = accNo2;
		this.name = name2;
		this.balance = balance2;
	}
	void display() {
		System.out.println("--------------customer details------------");
		System.out.println(this.accNo+" "+this.name+" "+this.balance);
	}

}
