package com.mycompany.dbutil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mycompany.dao.ProductManagementDAO;
import com.mycompany.domain.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class DBUtil {


	    
	    public int insert(Product sb) throws ClassNotFoundException, SQLException {
	   	 String sql="insert into productdb values(?,?,?)";
	   	 Connection con=ProductManagementDAO.dbConn();
	   	 PreparedStatement ps=con.prepareStatement(sql);
	   	 ps.setInt(1,sb.getProductId() );
	   	 ps.setString(2,sb.getProductName());
	   	 ps.setInt(3,sb.getProductPrice());
	   	 return ps.executeUpdate();
	   	 
	    }
	    

	    public int update(Product sb) throws ClassNotFoundException, SQLException {
	   	 String sql2 = "update productdb set ProductName=?,ProductPrice=?  where ProductId=?";
	   	 Connection con=ProductManagementDAO.dbConn();
	   	 PreparedStatement ps2=con.prepareStatement(sql2);
	   	 ps2.setInt(1,sb.getProductId() );
	   	 ps2.setString(2,sb.getProductName());
	   	 ps2.setInt(3,sb.getProductPrice());
	   	 return ps2.executeUpdate();
	   	 
	    }
	    
	    
	    public int delete(Product sb) throws ClassNotFoundException, SQLException {
		   	 String sql3 = "DELETE FROM productdb WHERE  ProductId=?";
		   	 Connection con=ProductManagementDAO.dbConn();
		   	 PreparedStatement ps3=con.prepareStatement(sql3);
		   	 ps3.setInt(1,sb.getProductId() );
		   	 ps3.setString(2,sb.getProductName());
		   	 ps3.setInt(3,sb.getProductPrice());
		   	 return ps3.executeUpdate();
		   	 
		    }
	    
	    
	    public int retrive(Product sb) throws ClassNotFoundException, SQLException {
		   	 String sql3 = "select * from ProductId=?";
		   	 Connection con=ProductManagementDAO.dbConn();
		   	 PreparedStatement ps4=con.prepareStatement(sql3);
		   	 ps4.setInt(1,sb.getProductId() );
		   	 ps4.setString(2,sb.getProductName());
		   	 ps4.setInt(3,sb.getProductPrice());
		   	 return ps4.executeUpdate();
		   	 
		    }

}



