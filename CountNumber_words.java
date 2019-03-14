package org.jsp.app;

public class CountNumber_words {
public static void main(String[] args) {
	
	String s1="jspiders";
	String[]a=s1.split(" ");
	String s2=a[a.length-1];
	System.out.println(s2.length());
}
}
