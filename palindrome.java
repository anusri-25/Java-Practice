package com.controlstatements;

public class palindrome {
	public static void main(String[]args) {
		String s="Class"; 
		String reverse="";
		int length=s.length();
		for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + s.charAt(i);
		
	      if (s.toLowerCase().equals(reverse.toLowerCase()))  
	         System.out.println("Entered string/number is a palindrome.");  
	      else  
	         System.out.println("Entered string/number isn't a palindrome.");   
		
	}

}

