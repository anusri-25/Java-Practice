package com.controlstatements;

import java.util.Scanner;

public class Factorial {
	public static void main(String[]args) {
		int  n,i=1,res=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		n=sc.nextInt();

		while( i<=n) {
			res*=i;
			
			i++;
		}
		System.out.println(res);
			
		
			
		}
		
		
	

}
