package com.practiseproject;

import java.util.Scanner;

public class duplicateCount
{
	public static void main(String[] args) 
	{
		
	
	int  i, j, Count, n;	
	System.out.println("Enter the number of elements in an array  :   ");
	Scanner scan = new Scanner(System.in);
    n = scan.nextInt();
     	
    int[]  a = new int[n];
    int[] Freq = new int[n];
    System.out.println("Enter the elements of an Array  :  ");
	for (i = 0; i < n; i++)       
	{
    	 a[i] = scan.nextInt();
	     Freq[i] = -1;
   	}      

	for (i = 0; i < n; i++)
	{
		Count = 1;
		for(j = i + 1; j < n; j++)
		{
    		if(a[i] == a[j])    
    		{
    			Count++;
    			Freq[j] = 0;   
    		}
    	}
    	if(Freq[i] != 0)        
    	{
    		Freq[i] = Count;
		}
	}
 System.out.println("The Frequency of the elements in this Array is : ");
 	for (i = 0; i < n; i++)
  	{
  		if(Freq[i] != 0)        
  		{
  			System.out.println(a[i]+ "  Occurs  Times "+Freq[i]);
		}		
  	}
	}
 	
}