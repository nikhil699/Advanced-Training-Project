package com.practiseproblem;
import java.util.ArrayList;
import java.util.LinkedList;

class employeeMain
{
	
	int EmployeeNo;
    String EmployeeName;
    String Address;
    
    public employeeMain(int EmployeeNo,String EmployeeName,String Address) 
    {
   	 this.EmployeeNo = EmployeeNo;
   	 this.EmployeeName = EmployeeName;
   	 this.Address = Address;
    }
    
}

public class Employee
{
    public static void main(String[] args) {
   	 employeeMain s1=new employeeMain(101,"Nikhil","Kanpur");
   	 employeeMain s2=new employeeMain(201,"Kratika","Lucknow");
   	 employeeMain s3=new employeeMain(301,"Nitish","Ahmedabad");
   	 employeeMain s4=new employeeMain(401,"Prathmesh","Hyderabad");
   	 employeeMain s5=new employeeMain(501,"Varsha","Telengana");
   	 LinkedList<employeeMain> al=new LinkedList();
   	 al.add(s1);
   	 al.add(s2);
   	 al.add(s3);
   	 al.add(s4);
   	 al.add(s5);
   	 for(int i=0;i<al.size();i++)
   	 {
   		 System.out.println(al.get(i).EmployeeNo+"   "+al.get(i).EmployeeName+"  "+al.get(i).Address);
   	 }
    }
}

