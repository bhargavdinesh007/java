package org.jsp.app;

import java.util.Scanner;

public class Substring {
	 public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        String inputString;
	        String subString;
	        System.out.println("Enter a string : ");
	        inputString = sc.nextLine();
	       System.out.println("Enter a substring to find in the string : ");
	       subString = sc.next();
	       int index = inputString.indexOf(subString);
	       if (index != -1) {
	            System.out.println("Index of this word : " + index);
	        } else {
	            System.out.println("The input sub-string is not found in the string.");
	        }
	        }
	         }


