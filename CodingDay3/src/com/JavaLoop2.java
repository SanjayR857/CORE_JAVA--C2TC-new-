package com;
// (a+2^0*b),(a+2^0*b+2^1*b).........
import java.util.Scanner;

public class JavaLoop2 {
	public static void main(String[] args) {
		
	  Scanner in = new Scanner(System.in);
      int t=in.nextInt();
      //number of loop 
      for(int i=0;i<t;i++){
          int a = in.nextInt();
          int b = in.nextInt();
          int n = in.nextInt();
         int  sum=0;
          for(int j=0;j<n;j++){
            sum=(int)(sum+(b*(Math.pow(2,j))));
              System.out.print(a+sum+" ");
          }
          System.out.println();
      }
      in.close();
  } 
}
/*
2
0
2
10
2 6 14 30 62 126 254 510 1022 2046 
5
3
5
8 14 26 50 98 
*/