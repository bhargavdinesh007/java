package org.jsp.app;

public class Addof_matrix {
public static void main(String[] args) {
	int a[][]= {{11,12,13},{4,5,6},{71,82,93}};
	int b[][]= {{21,31,11},{91,81,71},{51,41,31}};
	int c[][]=new int[3][3];
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			c[i][j]=a[i][j]+b[i][j];
			System.out.print(c[i][j]+" ");
		}
		System.out.println();	
}

}}