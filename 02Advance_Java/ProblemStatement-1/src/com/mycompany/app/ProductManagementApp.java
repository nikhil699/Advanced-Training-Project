package com.mycompany.app;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mycompany.dbutil.DBUtil;
import com.mycompany.domain.Product;
public class ProductManagementApp {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
   	 Scanner sc=new Scanner(System.in);
   	 while(true) {
   	 System.out.println("Student CRUD Operations\n1.insert Product record\n2.update Product record  with id\n3.delete the record with Product id\n4.retrive all the Products records\n5.exit\n=======================");
   	 System.out.println("Enter your choice\n=======================");
   	 int ch=sc.nextInt();
   	 switch(ch) {
   	 case 1:System.out.println("Enter the Product Id");
   			 Product sb = new Product();
   			 sb.setProductId(sc.nextInt());
   			 System.out.println("enter the Product Name");
   			 sb.setProductName(sc.next());
   			 System.out.println("enter the Product Rate");
  			 sb.setProductPrice(sc.nextInt());
   			 DBUtil scrud=new DBUtil();
   			 int rows=scrud.insert(sb);
   			 if(rows>0) {
   				 System.out.println("Product Added Successfully\n\n");
   			 }
   			
   		 break;
   	 case 2:System.out.println("Enter the Product Id");
   	 Product sb2 = new Product();
		 sb2.setProductId(sc.nextInt());
		 System.out.println("enter the Product Name");
		 sb2.setProductName(sc.next());
		 System.out.println("enter the Product Rate");
		 sb2.setProductPrice(sc.nextInt());
		 DBUtil scrud2=new DBUtil();
		 int rowss=scrud2.update(sb2);
	     System.out.println("Product Updated Successfully\n\n");
		 
   		 break;
   	 case 3: System.out.println("Enter the Product Id");
   	         Product sb3 = new Product();
		     sb3.setProductId(sc.nextInt());
		     System.out.println("enter the Product Name");
		     sb3.setProductName(sc.next());
		     System.out.println("enter the Product Rate");
		     sb3.setProductPrice(sc.nextInt());
		     DBUtil scrud3=new DBUtil();
		     int row3=scrud3.delete(sb3);
	         System.out.println("Product Updated Successfully\n\n");
   		 break;
   	 case 4: System.out.println("Enter the Product Id");
             Product sb4 = new Product();
             sb4.setProductId(sc.nextInt());
             System.out.println("enter the Product Name");
             sb4.setProductName(sc.next());
             System.out.println("enter the Product Rate");
             sb4.setProductPrice(sc.nextInt());
             DBUtil scrud4=new DBUtil();
             int row4=scrud4.retrive(sb4);
   		 break;
   	
   	 case 5:System.exit(0);
   		 break;
   	 default:
   	 }
   	 
   	 }
    }

}
