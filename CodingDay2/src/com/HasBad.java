package com;

import java.util.Scanner;

/*
Given a string, return true if "bad" appears starting at index 0 or 1 in the string, 
such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, 
including 0. Note: use .equals() to compare 2 strings
 */
public class HasBad {
	//method
private boolean check(String str) {
	if(str.length()>=3 && str.substring(0,3).equals("bad")) {
		return true;
	}
	else if(str.length()>=4 && str.substring(1,4).equals("bad")) {
		return true;
}
	return false;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//object creating
	HasBad s=new HasBad();
	//calling method
	System.out.println(s.check(sc.next()));
	System.out.println(s.check(sc.next()));
	System.out.println(s.check(sc.next()));
}
}
/*
output

xbadxx
true

badxxx
true

xxbad
false

*/