package org.Vehicles.controller;

import org.Vehicles.dao.DBoperations;
import org.Vehicles.models.VehiclesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleController {
    VehiclesDTO vehicle;

    // constructor injection
    @Autowired
    DBoperations operation;

    public VehicleController (DBoperations operation){
        this.operation = operation;
    }

    // setter and getter
    public void setBrand(String brand){
        vehicle.setBrand(brand);
    }
    public void setType(String type){
        vehicle.setType(type);
    }
    public String getBrand(){
        return vehicle.getBrand();
    }
    public String getType(){
        return vehicle.getType();
    }

    // setter injection
    @Autowired
    public void setVehicle(VehiclesDTO vehicle){
        this.vehicle = vehicle;
    }


    // database operations
    public void save(){
        operation.save(vehicle);
    }
    public void update(){
        operation.update(vehicle);
    }
}
