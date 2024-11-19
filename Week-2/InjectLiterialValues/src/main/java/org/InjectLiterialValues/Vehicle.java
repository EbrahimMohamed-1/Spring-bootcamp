package org.InjectLiterialValues;

import org.InjectLiterialValues.db.DBOperations;

public interface Vehicle {

    void saveToDB(Vehicle vehicle);
    void setDBOperations(DBOperations operations);
    void setBrand(String brand);
    String getBrand();



}
