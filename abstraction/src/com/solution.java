package com;
import java.util.Scanner;
public class solution {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	bank obj=new ATM();
	System.out.println("=======");
	System.out.println("1:Deposit\n2:withdraw\n3:checkbalance\n4:exit");
	while(true) {
		int check=s.nextInt();
		switch(check) {
		
		case 1:
			System.out.println("enter the deposit");
		        int dep=s.nextInt();
		        obj.deposit(dep);
		        break;
		        
		case 2:
			System.out.println("enter the withdraw");
        int with=s.nextInt();
        obj.withdraw(with);
        break;       
		       
		case 3:
			obj.checkbalance();
		 break;
		 
		case 4:System.out.println("thank you");
		       System.exit(0);
		break;
		
		default:
			System.out.println("invalid statment");
		        
		        
		}       
		System.out.println("----------------");
	}
}
}
