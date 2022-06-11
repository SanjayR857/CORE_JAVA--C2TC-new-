package com;

import java.util.Scanner;

public class Table {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	//object creating
	Table t=new Table();
	System.out.println("enter the number");
	//calling method
	t.display(s.nextInt());
}
//method
private void display(int N) {
	for(int i=1;i<=10;i++) {
		int R=N*i;
		System.out.println(N+" x "+i+" = "+R);
	}
}
}
/*
enter the number
11

11 x 1 = 11
11 x 2 = 22
11 x 3 = 33
11 x 4 = 44
11 x 5 = 55
11 x 6 = 66
11 x 7 = 77
11 x 8 = 88
11 x 9 = 99
11 x 10 = 110
*/