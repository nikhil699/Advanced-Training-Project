package projectWithMavan.AdvanceHibernate;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.productEntities.productEntities;
import org.hibernate.SessionFactory;


public class App 
{
    public static void main( String[] args )
    
    {
    	
        System.out.println( "Hello World!" );
        productEntities pro = new productEntities();
        pro.setId("01P20");
        pro.setName("Mozrella");
        pro.setPrice(1244.57);
        pro.setQuantity(155);
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory(); 
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(pro);
        tx.commit();
        session.close();
        System.out.println("All Set");
    }
}
