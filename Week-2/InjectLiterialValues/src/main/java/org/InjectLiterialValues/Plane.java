package org.InjectLiterialValues;

import org.InjectLiterialValues.db.DBOperations;

public class Plane implements Vehicle {
    public DBOperations databaseOperations;

    private String brand;

    public Plane(DBOperations databaseOperations) {
        this.databaseOperations = databaseOperations;
    }

    //setter method for setter injection
    public void setDBOperations(DBOperations databaseOperations) {
        this.databaseOperations= databaseOperations;
    }
    @Override
    public void saveToDB(Vehicle vehicle) {
        databaseOperations.save(vehicle);
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String getBrand() {
        return this.brand;
    }

}
