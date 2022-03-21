package com.productServices;

import java.util.List;

import com.productEntities.productEntities;

@Service
public class productServicesImpl implements productServices {



		List<productEntities> list;
		public studentDetailsServices()
		{
		list = new ArrayList<>();
		list.add(new productEntities(123,"Nikhil","Computer Science","2021"));
		list.add(new productEntities(131,"Sagar","Computer Science","2021"));
		}
		
		
		
		
		@Override
		public List<productEntities> StuDetails() 
		{
		
			return list;
		}


	    @Override
	    public productEntities productEntities(int stuId) 
		{
	    	productEntities r = null;
			for(productEntities details : list)
			{
				try {
					if(details.getId() == stuId)
					{
						r = details;
						break;
					}
				} catch (Exception e) {
				
					e.printStackTrace();
				}
			}
			return r;
		}



	    @Override
		public productEntities addNewStu(productEntities stuData) 
		{
		  list.add(stuData);
		  return stuData;
		}




		@Override
		public productEntities updateStuDetail(stuDetails stuUpdate) 
		{
			list.forEach
			(e -> {
				if(e.getId() == productEntities.getId())
				{
					e.setName(productEntities.getName());
					e.setBranch(productEntities.getBranch());
					e.setYear(productEntities.getYear());
				}
				
			}
			);
			return stuUpdate;
		}




		
	}
