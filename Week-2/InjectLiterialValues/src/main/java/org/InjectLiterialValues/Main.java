package org.InjectLiterialValues;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String [] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Plane planeBean = context.getBean("planeBean" , Plane.class);
        planeBean.setBrand("myPlane");
        planeBean.saveToDB(planeBean);
        //--------------------------------
        Car carBean = context.getBean("carBean" , Car.class);
        carBean.setBrand("BMW");
        carBean.saveToDB(carBean);

    }
}