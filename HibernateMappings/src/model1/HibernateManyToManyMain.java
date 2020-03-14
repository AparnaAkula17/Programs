package model1;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateManyToManyMain 
{
	public static void main(String[] args)
	{
		
		Item1 iphone = new Item1();
		iphone.setPrice(100); iphone.setDescription("iPhone");
		
		Item1 ipod = new Item1();
		ipod.setPrice(50); ipod.setDescription("iPod");
		
		Set<Item1> items = new HashSet<Item1>();
		items.add(iphone); items.add(ipod);
		
		Cart1 cart = new Cart1();
		cart.setItems(items);
		cart.setTotal(150);
		
		Cart1 cart1 = new Cart1();
		Set<Item1> items1 = new HashSet<Item1>();
		items1.add(iphone);
		cart1.setItems(items1);
		cart1.setTotal(100);
		
		SessionFactory sessionFactory = null;
		try
		{
			sessionFactory = HibernateUtil1.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(cart);
			session.save(cart1);
			System.out.println("Before committing transaction");
			tx.commit();
			sessionFactory.close();
			
			System.out.println("Cart ID="+cart.getId());
			System.out.println("Cart1 ID="+cart1.getId());
			System.out.println("Item1 ID="+iphone.getId());
			System.out.println("Item2 ID="+ipod.getId());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(sessionFactory != null && !sessionFactory.isClosed()) sessionFactory.close();
		}
	}

}
