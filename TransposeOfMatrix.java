package org.jsp.app;

import java.util.Scanner;

public class TransposeOfMatrix {
public static void main(String[] args) {
	int i,j;
	System.out.println("Enter the no of rows and columns:");
	Scanner s= new Scanner(System.in);
	int row= s.nextInt();
	int column=s.nextInt();
	int array[][]=new int[row][column];
	System.out.println("Enter matrix");
	for(i=0;i<row;i++)
	{
		for(j=0;j<column;j++)
		{
			array[i][j]=s.nextInt();
			System.out.println(" ");
			}
		}
	System.out.println("The Matrix before transpose is:");
	for(i=0;i<row;i++)
	{
		for(j=0;j<column;j++)
		{
			System.out.println(array[i][j]+" ");
		}
		System.out.println(" ");
	}
	System.out.println("The transpose matrix is:");
	for(i=0;i<column;i++)
	{
		for(j=0;j<row;j++)
		{
			System.out.println( array[j][i]+" ");
		}
		System.out.println(" ");
	}
}
}
