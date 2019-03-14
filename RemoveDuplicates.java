package org.jsp.app;


public class RemoveDuplicates {
	public static void main(String[] args) {
	int[]a= { 5,10,10,7,8,3,6,7,8,10};
	for(int i=0;i<=a.length-1;i++)
	{ int count=0;
		for(int j=i+1;j<=a.length-1;j++)	
		{
			if(a[i]==a[j])
			{
				count++;
				break;
			}}
			if(count==0)
			{
				System.out.println(a[i]);
			}
	
	}
	
	}
 }