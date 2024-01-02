package com.mypackage.array;

public class ArrayExample2 {
	public static void main(String[]args) {
		int[][] a= {{20,30,40},{50,60,70},{80,90,12}};
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		int[][] b=new int[3][3];
		for(int k=0;k<b.length;k++) {
			for(int l=0;l<b.length;l++) {
				b[k][l]=(int)(Math.random()*10);
				System.out.print(b[k][l]+" ");
			}
			System.out.println();
		}
	}

}
