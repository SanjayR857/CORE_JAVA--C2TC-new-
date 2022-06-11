package com;

	import java.util.Scanner;

	public class Sample {

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        //user input
	        int i=scan.nextInt();
	        double d=scan.nextDouble();
	        scan.nextLine();
	        String s=scan.nextLine();
	        System.out.println("String: " +s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
	    }
	}
/*
 input
 
 42
3.145
welcome to India

output

String: welcome to India
Double: 3.145
Int: 42

 */

