package com.practisepractise;
import java.util.HashMap;
import java.util.Scanner;
public class Productclass
{
public static void main(String[] args)
 {
    
     HashMap<String,String> map = new HashMap<>();

   
     map.put("P001","Maruti 800");
     map.put("P002","Maruti Zen");
     map.put("P003","Maruti Dezire");
     map.put("P004","Maruti Alto");
     map.put("P005","Maruti Swift");

    


   
     System.out.println(map);

    
     System.out.println("Enter The Key Which You Eant To Find");
     Scanner sc = new Scanner(System.in);
     String key = sc.nextLine();
     if (map.containsKey(key)) 
     {
    
         String value = map.get(key);

         System.out.println("value for The Given key  ----->  " +value);
                           
     }
     else
     {
    	 System.out.println("Please Enter a Right Key");
     }
 }
}