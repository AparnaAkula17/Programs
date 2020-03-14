package com.hibernate.mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
public class StoreData {

public static void main(String[] args) {
// TODO Auto-generated method stub
SessionFactory sessionFactory = new Configuration().
							configure("/hibernate.cfg.xml").
							buildSessionFactory();

 Session session1 = sessionFactory.openSession();  
 Session session2 = sessionFactory.openSession();  
 Session session3 = sessionFactory.openSession();  
        Transaction t1 = session1.beginTransaction();  
        Transaction t2 = session2.beginTransaction();
        Transaction t3 = session3.beginTransaction();
           Employee e1=new Employee();    
           e1.setEmpid(3);    
           e1.setFirstName("Kavya");    
           e1.setLastName("Pilli");
           session1.save(e1);  
           t1.commit();  
           Employee e2=new Employee();    
           e2.setEmpid(4);    
           e2.setFirstName("Aunja");    
           e2.setLastName("Dhanekula");
           session2.save(e2);  
           t2.commit();  
           Employee e3=new Employee();    
           e3.setEmpid(5);    
           e3.setFirstName("Nissi");    
           e3.setLastName("Manne");
       
      session3.save(e3);  
     
      t3.rollback();
      System.out.println("successfully saved");    
      sessionFactory.close();  
       session1.close();    
       session2.close();  
       session3.close();  
}

}