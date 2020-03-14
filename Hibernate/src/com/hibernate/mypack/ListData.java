package com.hibernate.mypack;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.query.Query;;

public class ListData {
public static void main(String[] args) {
// TODO Auto-generated method stub
//creating configuration object
SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
       Session session = sessionFactory.openSession();  
        Transaction t = session.beginTransaction();  
        //String hql="FROM Employee";
        //String hql="FROM Employee as E where E.id>=1";
        String hql="SELECT E.firstName from Employee E where E.empid>1";
        Query query=session.createQuery(hql);
        List<String> items=query.list();
        for(String s:items)
        {
        System.out.println(s);
        }
}
}