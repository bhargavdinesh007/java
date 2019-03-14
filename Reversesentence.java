package org.jsp.app;

public class Reversesentence {
	public static void main(String[] args) {
		String s1="testing and development";
		String s2=" ";
		String[]a=s1.split("");
		s2=s2+a[a.length-1];
		for(int i=1;i<=a.length-2;i++)
		{
		s2=s2+" "+a[i];	
	}
        s2=s2+" "+a[0];
System.out.println(s2);
	}}
