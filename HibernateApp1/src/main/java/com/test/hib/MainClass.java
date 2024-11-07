package com.test.hib;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.test.hib.entity.Movie;
import com.test.hib.util.HibernateUtil;



public class MainClass {

	public static void main(String[] args) {
		
		Movie m = new Movie(101, "Test-Movie","hindi");
		
		 Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // save the student objects
	            session.persist(m);
	            
	            // commit transaction
	            transaction.commit();
	            
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }

	        try (Session session = HibernateUtil.getSessionFactory().openSession())
	        {
	            List<Movie> allMoviesFromDB = session.createQuery("from Movie", Movie.class).list();
	            
	            allMoviesFromDB.stream().forEach((mdb)->{
	            	System.out.println(mdb);
	            });
	            
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }

		
		
	}//end main
}
