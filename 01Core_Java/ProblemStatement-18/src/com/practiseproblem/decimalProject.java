package com.practiseproblem;
import java.util.ArrayList;
import java.util.Scanner;
public class decimalProject 
{

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) 
    {
           while (in.hasNext()) {
            int n = in.nextInt();
            int denum = in.nextInt();
           printPeriodic(n , denum);
           }
    }
    static void printPeriodic(int num,int denum){
            System.out.printf("%d/%d = %d.", num, denum, num / denum);
            num %= denum;
            int found = -1;
            ArrayList<Integer> digits = new ArrayList<>();
            ArrayList<Integer> seen = new ArrayList<>();
            for(;;){
                int cur = (num*10);
                int cur_rem = cur%denum;
                    for(int i =0;i<seen.size();i++){
                            if(seen.get(i) == cur_rem){
                                found = i;
                                break;
                            }   
                    }
                    if(found != -1)
                       break;
                    else{
                        seen.add(cur_rem);
                        digits.add(cur/denum);
                        num = cur_rem;         
                    }
            }
            if(num == 0)
            {
                for(int i = 0;i<=found;i++)
                {
                    System.out.printf("%d",digits.get(i));
                }   
                System.out.printf("(0)\n");
            }
            else
            {
                for(int i = 0;i<found;i++)
                {
                    System.out.printf("%d",digits.get(i));
                }
                System.out.print("(");
                for(int i =found;i<digits.size() && i<found+50;i++)
                {
                    System.out.printf("%d",digits.get(i));
                }
                if(found+50 <digits.size())
                {
                	 System.out.printf("...");
                }

                System.out.printf(")\n");
            }
                 System.out.println("   "+((int)digits.size() - found)
                         + " = number of digits in repeating cycle");
            }
}