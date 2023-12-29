package com.controlstatements;

import java.util.Scanner;

public class Geometric {
public static void main(String[]args) {
	int a;
	int b;
	int c;
	int result;
	double area;
	double y;
	double x=3.14;
	Scanner sc=new Scanner(System.in);
	System.out.println("Select  a shape :1,2,3,4");
	a=sc.nextInt();
	System.out.println("enter b value");
	b=sc.nextInt();
	System.out.println("enter c value");
	c=sc.nextInt();
	switch(a) {
	case 1:
		result=b*b;
		System.out.println( "Area of square "+result);
		break;
	case 2:
		result=b*c;
		System.out.println("Area of rectangle "+result);
		break;
	case 3:
		result=(b*c)/2;
		System.out.println("Area of triangle "+result);
		break;
	case 4:
		  area=x*b*b;
		  System.out.println("Area of circle "+area);
		  break;
		  default:
			  System.out.println("invalid operator");
	}
	
	
}
}
