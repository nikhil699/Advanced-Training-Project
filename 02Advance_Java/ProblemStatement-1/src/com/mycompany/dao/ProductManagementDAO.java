package com.mycompany.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ProductManagementDAO 
{

	    public static Connection dbConn() throws ClassNotFoundException, SQLException {
	   	 Class.forName("com.mysql.cj.jdbc.Driver");
	   	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb","root","12345");
	   	 return con;
	    }

}
  
