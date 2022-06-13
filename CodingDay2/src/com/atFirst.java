package com;

import java.util.Scanner;

/*
 
Given a string, return a string length 2 made of its first 2 chars. If the string length 
is less than 2, use '@' for the missing chars
 */
public class atFirst {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
    //object creating
	atFirst s1=new atFirst(s.next());
	atFirst s2=new atFirst(s.next());
	atFirst s3=new atFirst(s.next());
}
//constructor
atFirst(String name) {
	if(name.length()>0) {
		if(name.length()>1)System.out.println(name.substring(0,2));
		else {
			System.out.println(name.substring(0)+"@");
		}
	}
	else {
		System.out.println("@@");
	}
}
}
/*
output

hello
he

A
A@

sanjay
sa

*/