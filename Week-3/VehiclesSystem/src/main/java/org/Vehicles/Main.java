package org.Vehicles;

import org.Vehicles.config.config;
import org.Vehicles.controller.VehicleController;
import org.Vehicles.dao.DBconnection;
import org.Vehicles.models.VehiclesDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

public class Main {
    public static void main(String[] args){
       ApplicationContext context = new AnnotationConfigApplicationContext(config.class);

        VehicleController vehicleController1 = context.getBean("vehicleController", VehicleController.class);


        VehiclesDTO vehicle1 = new VehiclesDTO(0, "BMW" , "Car" , new Date());
        vehicleController1.setVehicle(vehicle1);
        vehicleController1.save();


    }
}