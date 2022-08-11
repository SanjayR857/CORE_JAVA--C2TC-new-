package com;

public class ATM implements bank {
	int balance=10000;
	//Deposit amount
	public void deposit(int amount) {
		System.out.println("entered the deposit amount:"+amount);
		balance+=amount;
		System.out.println("deposit is succesfull");
	}
    //withdraw method
	public void withdraw(int amount) {
		System.out.println("entered the withdraw amount:"+amount);
		balance-=amount;
		System.out.println("withdraw is succesfull");
		}
		//check balance method
	public void checkbalance() {
		System.out.println("check the balance:"+balance);
	}

}
