package com;

import java.util.Scanner;

/*
 Given a string and an index, return a string length 2 starting at the given index.
  If the index is too big or too small to define a string length 2, use the first 2 chars.
  The string length will be at least 2
 */
public class TwoChar {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//number of loop
	System.out.println("enter number of loop");
     int x=sc.nextInt();
     //object creating
     TwoChar f=new TwoChar();
     for(int i=0;i<x;i++) {
    	 //calling method and store it
    	 String name=f.test(sc.next(), sc.nextInt());
    	 //result
    	 System.out.println(name);
     }
     
}
//return type String method
public String test(String str,int index) {
	if(str.length()>(index+1) && index>0) {
		return str.substring(index,(index+2));
	}
	return str.substring(0,2);
}
}
/*
output

enter number of loop
3

java
0
ja

java
2
va

java
3
ja

*/