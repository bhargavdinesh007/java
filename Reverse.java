package org.jsp.app;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a sentence to reverse it");
		String word=input.nextLine();
		String[] split_word=word.split(" ");
		String reverse="";
	for(int index=0;index<split_word.length;index++)
	{
		for(int index1=split_word[index].length()-1;index1>=0;index1--)
		{
			 reverse=reverse+split_word[index].charAt(index1);
		}
		reverse=reverse+" ";
	}
	System.out.println(reverse);
	}
}

