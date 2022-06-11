package com;

import java.util.Scanner;

/*You are required to enter a word that consists of  and  that denote the number of Zs 
 and Os respectively. The input word is considered similar to word zoo if .
Determine if the entered word is similar to word zoo.
For example, words such as zzoooo and zzzoooooo are similar to word zoo but not
 the words such as zzooo and zzzooooo*/
public class Zoos{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//String input
		String name=scan.next();
		//object creating
		Zoos d1=new Zoos();
        //calling method
		if(name.length()<=20) {
	     System.out.println("name:"+name+" "+d1.check(name));
		}
		else {
			System.out.println("false");
		}
	
	}
    private boolean check(String name) {
    	 //taking to count z
    	 int x=0;
    	 //taking to count o
    	 int y=0;
    	 //loop 
    	 for(int i=0;i<name.length();i++)
    	 {
    		 if(name.charAt(i)=='z') {
    			 x++;
    		 }
    		 if(name.charAt(i)=='o') {
    			 y++;
    		 }
    		
    	 }
    	 if(x*2==y) {
    		 return true;
    	 
	}
    	 else {
    		 return false;
    	 }
    
}
}
/*output
name:zzoooo true
name:zzooo false
 */

