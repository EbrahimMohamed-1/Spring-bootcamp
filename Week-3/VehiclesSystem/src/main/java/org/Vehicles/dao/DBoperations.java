package org.Vehicles.dao;

import org.Vehicles.config.config;
import org.Vehicles.models.VehiclesDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
@Component
public class DBoperations {
    DBconnection dBconnection = new DBconnection();
    Connection con = DBconnection.con;

    public void save(VehiclesDTO vehicle){
        if (con == null) System.out.println("connection field");
        if (vehicle.getId()==0){
            String query = "insert into vehicle ( Vehicle_ID, Brand, Type) values (?, ?, ?)";
            try(PreparedStatement preparedStatement = con.prepareStatement(query)) {
                System.out.println("employee '"+ vehicle.getId()+ "' added successfully");
                preparedStatement.setInt(1, vehicle.getId());
                preparedStatement.setString(2,vehicle.getBrand());
                preparedStatement.setString(3, vehicle.getType());
                //preparedStatement.setDate(4, new java.sql.Date(vehicle.getJoiningDate().getTime()));
                preparedStatement.executeUpdate();
                //preparedStatement.close();
            } catch (SQLException se){
                se.printStackTrace();
            }
        }
    }



    //___________________Update_____________________//

    public void update( VehiclesDTO vehicle){
        if (con == null) System.out.println("connection field");
        if (vehicle.getId() != 0){
            String query = "insert into vehicle (brand, type) values (?, ?) where id = ?";
            try(PreparedStatement preparedStatement = con.prepareStatement(query)) {
                System.out.println("employee '"+ vehicle.getId()+ "' updated successfully");
                //preparedStatement.setInt(1, vehicle.getId());
                preparedStatement.setString(2,vehicle.getBrand());
                preparedStatement.setString(3, vehicle.getType());
                preparedStatement.executeUpdate();
                //preparedStatement.close();
            } catch (SQLException se){
                se.printStackTrace();
            }
        }
    }





}
