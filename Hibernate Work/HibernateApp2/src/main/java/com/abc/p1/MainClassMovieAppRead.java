package com.abc.p1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClassMovieAppRead {

	public static void main(String[] args) {
		
		Movie m = new Movie(101, "ABC", "Hindi");
		
		// read cfg file
		 SessionFactory hibernateFactory = new Configuration().configure()
	                .buildSessionFactory();
	      Session hibernate = hibernateFactory.openSession();
	      
	     
	     
	       
	      Movie savedMovie = hibernate.load(Movie.class, 101);
	        
	      System.out.println(" From Data base "+savedMovie);
	
	      hibernate.close();
	      hibernateFactory.close();
	      System.out.println(" Close ");
	}
}
