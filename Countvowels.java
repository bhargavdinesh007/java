package org.jsp.app;

public class Countvowels {
public static void main(String[] args) {
	String s1= "jspiders";
	int count=0;
	for(int i=0;i<=s1.length()-1;i++)
	{
		char ch=s1.charAt(i);
		if (ch=='a'||ch=='e'||ch=='i'||ch=='0'||ch=='u')
		{
			count++;
	}}
	          System.out.println(count);

}}
