package com.mypackage.strings;

public class Strings {
	public static void main(String[]args) {
		//String literals
		String str="JAVA";
		String str1="java";
		//using new keyword
		String str2=new String("hello");
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str.charAt(0));
		System.out.println(str.length());
		System.out.println(str.replace('j','l'));
		System.out.println(str.concat(str2));
		System.out.println(str.indexOf("j"));
		System.out.println(str.hashCode());
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str1.hashCode());
		System.out.println(str.equals(str2));
		System.out.println(str.isEmpty());
		System.out.println(str.charAt(0));
		System.out.println(str1 .contains("a"));
		
	}
	}
