package practiseproblem;
import java.util.*;
public class suffleString 
{
 static boolean isShuffledSubString(String A, String B)
 {
   int n = A.length();
   int m = B.length();


   if (n > m)
    {
      return false;
    }
   else
    {

    
       A = sort(A);

     
       for (int i = 0; i < m; i++)
         {

         
           if (i + n - 1 >= m)
           {
        	   return false;
           }

         
         String str = "";

        
         for (int j = 0; j < n; j++)
         {
        	 str += B.charAt(i + j);
         }

       
         str = sort(str);

        
         if (str.equals(A))
             return true;
     }
 }
 return false;
}


static String sort(String inputString)
{

 char tempArray[] = inputString.toCharArray();
  

 Arrays.sort(tempArray);
  

 return String.valueOf(tempArray);
}


public static void main(String[] args)
{
 Scanner scan = new Scanner(System.in);
 System.out.println("Enter Your First String ");
 String str1 = scan.nextLine();
 System.out.println("Enter Your Second String ");
 String str2 = scan.nextLine();



 boolean a = isShuffledSubString(str1, str2);


 if (a)
     System.out.print("YES");
 else
     System.out.print("NO");
 System.out.println();
}
}