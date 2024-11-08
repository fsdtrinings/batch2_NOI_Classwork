package com.abc.p1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClassMovieApp {

	public static void main(String[] args) {
		
		Movie m = new Movie(101, "ABC", "Hindi");
		
		// read cfg file
		 SessionFactory hibernateFactory = new Configuration().configure()
	                .buildSessionFactory();
	      Session hibernate = hibernateFactory.openSession();
	      
	      System.out.println(" --->> 1 Hibernate Factory Set up");
	   // load hibernate
	      hibernate.beginTransaction();
	       
	      System.out.println(" --->> 2 Transaction Start ");  
	        
		// provide movie to hibernate
	      hibernate.save(m); // insert query
	      hibernate.getTransaction().commit(); // executeUpdate();
	      System.out.println(" ---->> Data Saved ");
	      // save the movie
	      hibernate.close();
	      hibernateFactory.close();
	      System.out.println(" Close ");
	}
}
