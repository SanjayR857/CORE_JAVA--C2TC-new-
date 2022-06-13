package com;

public class PosAndNeg {
	//instance variables
	int B;
	int H;
	//constructor
public PosAndNeg(int B,int H) {
	this.B=B;
	this.H=H;
}
//method 
void display() {
	if(B>0 && H>0) {
		System.out.println(B*H);
	}
	else {
		System.out.println("Breadth and height must be positive");
	}
}
public static void main(String[] args) {
	PosAndNeg p1=new PosAndNeg(2,1);
	PosAndNeg p2=new PosAndNeg(-9, 2);
	PosAndNeg p3=new PosAndNeg(56, 98);
	p1.display();
	p2.display();
	p3.display();
}
}
/*
output
2
Breadth and height must be positive
5488
*/