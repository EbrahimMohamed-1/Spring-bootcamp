package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

//import javax.persistence.Query;
import java.util.List;

public class HQLQueries {
    public static void main(String [] args){
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate-config.xml")
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        // Read
        session.beginTransaction();
        Query query = session.createQuery("FROM Student");
        List<Student> studentList = query.getResultList();
        for (Student s : studentList){
            System.out.println(s);
        }


        // Update
        // for more info
        //https://www.tutorialspoint.com/hibernate/hibernate_query_language.htm
        //https://docs.jboss.org/hibernate/orm/3.3/reference/en/html/queryhql.html
        Query update = session.createQuery("UPDATE  Student SET first_name= :first_name WHERE id= :i ");
        query.setParameter(first_name, "lol");
        query.setParameter("i", 1);
        int status=update.executeUpdate();
        System.out.println(status);
        session.getTransaction().commit();


    }
}
