package org.jsp.app;

public class Removespaces {
public static void main(String[] args) {
	String s1="j a v a aa";
	String s2=" ";
	for(int i=0;i<s1.length()-1;i++)
	{
		char ch=s1.charAt(i);
			if(ch!=' ')
	{
		s2=s2+ch;
		
	}}
	System.out.println(s2);
}
}
