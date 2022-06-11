package com;

import java.util.Scanner;

/*Please complete the partially completed code in the editor. If your code successfully converts  into a string  the code will print "Good job". 
 Otherwise it will print "Wrong answer".
 */
public class IntTOString {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
    //input
    int n=s.nextInt();
    //converting to String
    String sa=Integer.toString(n);
    //checking
     if(n==Integer.parseInt(sa)){
       System.out.println("Good job"); 
     }
     else{
         System.out.println("Wrong");
     }
}
}
/*
 good bye
 */
