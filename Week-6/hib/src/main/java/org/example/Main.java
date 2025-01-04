package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate-config.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {
            Student st = new Student("Ebrahim", "Mohamed");

            // Step1: start transactions
            session.beginTransaction();

            // Step2: Save th object to database
            // you can use persist
            session.save(st);

            // Step3:  commit th transaction (update th database or reflect on the database).
            //session.getTransaction().commit();



            // retrieve object from database
            //session.beginTransaction();
            int id= 2;
            Student student = session.get(Student.class, id);

            System.out.println(student);
           // session.getTransaction().commit();


            // update object
            //session.beginTransaction();
            Student student1 = session.get(Student.class, 2);
            System.out.println(student1);
            student1.setFirst_name("Mohamed");
            //session.getTransaction().commit();


            // object deletion
            //session.beginTransaction();
            session.delete(student1);
            session.getTransaction().commit();




        }catch (Exception e){
            e.printStackTrace();
        }

    }
}