package com.practiseproblem;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class collectionFramework 
{
   public static void main(String[] args) 
   {
      List aList = new ArrayList();
      aList.add("Anamika");
      aList.add("Babita");
      aList.add("Candrika");
      aList.add("Dushyant");
      aList.add("Errior");
      System.out.println("Enter Your Name Which You Want To Search");
	  Scanner sc = new Scanner(System.in);
	  String name = sc.nextLine();
      if(aList.contains(name))
      {
    	    System.out.println("The element ----"+name+"---- is available in the ArrayList");
      }
      else
      {
    	  System.out.println("The element ---"+name+"---- is not available in the ArrayList");
      }
     
   }
}