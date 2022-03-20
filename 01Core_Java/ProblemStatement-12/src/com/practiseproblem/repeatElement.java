package com.practiseproblem;
import java.util.*;
public class repeatElement 
{
 
    static void printFirstRepeating(int arr[])
    {
      
        int min = -1;
 
       
        HashSet<Integer> set = new HashSet<>();
 
      
        for (int i=arr.length-1; i>=0; i--)
        {
            
            if (set.contains(arr[i]))
                min = i;
 
            else   
                set.add(arr[i]);
        }
 
        
        if (min != -1)
          System.out.println("The first repeating element is " + arr[min]);
        else
          System.out.println("There are no repeating elements");
    }
 
   
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scann = new Scanner(System.in);
        System.out.println("Enter How Many Number You Want To Enter");
        int a = scann.nextInt();
        System.out.println("Now Enter Your Number");
    	int[] arr = new int[a];
    	for(int i=0;i<a;i++)
    	{
    		arr[i] = scann.nextInt();
    	}
        printFirstRepeating(arr);
    }
}