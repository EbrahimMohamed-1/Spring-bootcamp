package org.example;

import org.example.model.Passport;
import org.example.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CreatePersonAndPassport {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate-config.xml")
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Passport.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();



        try{
            Person p2 = new Person("Ebrahim" , "Mohamed", "20-5-2001" );
            Passport passport = new Passport(p2, "b1234abs2", "20-10-2026");
            session.beginTransaction();

            //session.persist(p2);
//           Person p1 =session.get(Person.class, 2);
//            passport.setPerson_id(p1);
           // System.out.println(p2);
            //session.persist(passport);
            Person p1 =session.get(Person.class, 1);
            System.out.println(p1);
            session.getTransaction().commit();

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            sessionFactory.close();
            session.close();
        }


    }

}
