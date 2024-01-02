package com.mypackage.strings;

public class ArrayExample1 {
public static void main(String[]args) {
	int[] a= {20,30,40};
	
			for(int i=0;i<a.length;i++) {
	
		System.out.println(a[i]);
}
String[] k= {"anu","sri","kammili"};
for(int s=0;s<k.length;s++) {

	System.out.println(k[s]);
}
	//Enhanced for loop
for(String b:k) {
	System.out.println(b);
}
}
}
