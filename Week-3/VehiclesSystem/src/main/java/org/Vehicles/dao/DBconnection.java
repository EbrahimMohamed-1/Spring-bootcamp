package org.Vehicles.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@Component
@Scope("singleton")
public class DBconnection {

    @Value("${DatabaseConnection.HOST}")
    private  String HOST;
    @Value("${DatabaseConnection.PORT}")
    private  int PORT;
    @Value("${DatabaseConnection.DB_NAME}")
    public  String DB_NAME;
    @Value("${DatabaseConnection.USERNAME}")
    private String USERNAME;
    //@Value("${DatabaseConnection.PASSWORD}")
    private  String  PASSWORD = "";
    //private static  final String url ="jdbc:postgresql:db";

    public DBconnection(){}
   public static Connection con = null;
    @PostConstruct
    public Connection connectToDatabase() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(String.format("jdbc:mysql://%s:%d/%s", HOST, PORT, DB_NAME), USERNAME,PASSWORD);
            //return con;
            System.out.println( "successful connection to " + DB_NAME);

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Connection ERROR ");
            e.printStackTrace();

        }

        //return con;
        return con;
    }
    @PreDestroy
    public  void DisconnectFromDatabase() throws SQLException{
        System.out.println("connection closed");
       con.close();
    }


}
