package com;

import java.util.Scanner;

public class PrintStringandInt {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        //loop for 3 times
        for(int i=0;i<3;i++){
        	//user input
            String s1=sc.next();
            int x=sc.nextInt();
               System.out.printf( "%-15s%03d %n", s1, x);
        }
        System.out.println("================================");

}
}
/*
 ================================
java           096 
oops           456 
hackerrank     010 
================================

 */

