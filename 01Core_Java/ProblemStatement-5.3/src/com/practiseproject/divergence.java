package com.practiseproject;

public class divergence 
{
  public static void main(String[] args) 
  {
	  String string = "Javatpoint";  
	  String str = "Javatpoint";
	  String abc;
	  StringBuffer sb= new StringBuffer(string);
	  System.out.println("The Length Is : "+string.length());
	  

	  StringBuffer a =  sb.deleteCharAt(sb.length()-1); 
	  abc = str.substring(1, str.length());
	  
	  System.out.println(abc);
	}  
 }
