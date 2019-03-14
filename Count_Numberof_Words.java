package org.jsp.app;

import java.util.Scanner;

public class Count_Numberof_Words {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter a sentence ");
	
	while(sc.hasNext()){
		
		String line=sc.nextLine();
		
		String[] arr=line.split(" ");
		int words=0;
		
		for(int i=0;i<arr.length;i++){
			words++;
		} 
	
		System.out.println("Number of words in a given sentence:"+words);
	}
}
}
