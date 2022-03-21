package com.productServices;
import java.util.List;
import com.productEntities.productEntities;
public interface productServices 
{
	
		public List<productEntities> proDetails();
		
		public productEntities proDetail(int stuID);
		
		public productEntities addNewStu(productEntities stuData);
		
		public productEntities updateStuDetail(productEntities stuUpdate);
		
	
}
