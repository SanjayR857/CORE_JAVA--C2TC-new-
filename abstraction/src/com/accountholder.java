package com;

public class accountholder {
public static void main(String[] args) {
       bank b=new ATM();
       
       b.checkbalance();
       
       System.out.println("========");
       b.deposit(7000);
       b.checkbalance();
       System.out.println("=======");
       b.withdraw(5000);
       b.checkbalance();
}
}
