package com.practiseproject;

import java.util.Scanner;

public class stringPractise
{
  public static void main(String[] args) 
    {
   	        	
   	 String input;
     StringBuilder str = new StringBuilder("AAAABBBCCCC");
 
   	 Scanner sc = new Scanner(System.in);
   	 input = sc.nextLine();
   	 System.out.println("convert lower to upper :"+input.toUpperCase());
   	 System.out.println("convert upper to lower :"+input.toLowerCase());
   	 System.out.println("character at a location : "+input.charAt(3));
   	 System.out.println("the string length is: "+ input.length());
	 System.out.println("the string length is: "+ input.split("M"));
	 System.out.println("the string length is: "+ input.length());
	   System.out.println("String = " + str.toString());
              
    }
}