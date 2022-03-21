package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.noteBook;
import com.helper.factoryProvided;


public class saveMyData extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public saveMyData() 
    {
        super();
        
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	   try
	   {    
	   String Title = request.getParameter("title");
	   String Content = request.getParameter("content");
	   noteBook note = new noteBook(Title,Content,new Date());
	   System.out.println(note.getTitle() +" And "+ note.getContent());
	   Session s = factoryProvided.getFactory().openSession();
	   Transaction tx = s.beginTransaction();
	   s.save(note);
	   tx.commit();
	   s.close();
	   PrintWriter pr = response.getWriter();
	   pr.println("<h1> Sucessfully Register Your Data </h1>");
	   pr.println("<p1><a href='sowNote.jsp'>View All Notes</a></p1>");
       }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	}

}
