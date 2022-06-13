package com;

import java.util.Scanner;

public class ForntAgain {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number of loop");
	int x=sc.nextInt();
	//object creating
	ForntAgain s=new ForntAgain();
	//loop 
	for(int i=0;i<x;i++) {
		//input
	String name=s.check(sc.next());
	//output
	System.out.println(name);
	}

}
//method 
private String check(String str) {
	if(str.length()<2) {
		return  str+" False";
	}
	String first=str.substring(0,2);
	String  last=str.substring(str.length()-2);
	if(first.equals(last)) {
		return str+" true";
	}
	return str+" false";
}
}
/*
output
enter number of loop
3

edited
edited true

edit
edit false

ed
ed true
*/