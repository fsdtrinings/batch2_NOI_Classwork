package p1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClassStudentApp {
    public static void main(String[] args){
        System.out.println("Student App");

        SessionFactory sessionFactory = new Configuration().configure()
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Course c = new Course(701, "ASP NET", 80);
        Address a = new Address("A-123", "Noida", "UP");
        Student stu = new Student(101, "Ramesh", 50);
        stu.setAddress(a);
        stu.setCourse(c);
        
        session.save(c);
        session.save(stu);
        
        System.out.println("Student Saved ");
        session.getTransaction().commit();
        System.out.println("Transaction Commit");
        session.close();
        System.out.println("Hibernate Close");

        sessionFactory.close();
    }
}
