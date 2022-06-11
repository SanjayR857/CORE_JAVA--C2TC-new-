package com;

import java.util.Scanner;

public class DataTypes {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	//enter number of input
	int t=s.nextInt();
	for(int i=0;i<t;i++) {
		long x=s.nextLong();//enter input to check
		
         System.out.println(x+" can be fitted in:");
         if(x>=-128 && x<=127)System.out.println("* byte");
         if(x>= -32768 && x<=32767)System.out.println("* short");
          if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
         if(x>=(-(Math.pow(2,63))) && x<=(Math.pow(2,63)-1))System.out.println("* long");
	}
}
}
/*
3
-155
-155 can be fitted in:
* short
* int
* long
23567
23567 can be fitted in:
* short
* int
* long
15000000000
15000000000 can be fitted in:
* long
*/