package com;

import java.util.Scanner;

//enter 3 variables and print them
public class Input {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int c=scan.nextInt();
	System.out.println("output");
	System.out.println(a+"\n"+b+"\n"+c);
}
}
/*
42
46
79
output
42
46
79
*/