package p1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {
    public static void main(String[] args){
        System.out.println("Hello World");

        SessionFactory sessionFactory = new Configuration().configure()
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Host host = new Host("klrx001", "RedHat");
        session.save(host);
        System.out.println("Data Saved ");
        session.getTransaction().commit();
        System.out.println("Transaction Commit");
        session.close();
        System.out.println("Hibernate Close");

        sessionFactory.close();
    }
}
