package org.InjectLiterialValues.db;

import org.InjectLiterialValues.Vehicle;

public class DBOperations {
    private String url;
    private String userName;
    private String password;


    public DBOperations() {
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void save(Vehicle vehicle)
    {
        System.out.println("---------------connecting to database with properties------------------");
        System.out.printf("url: %s\n userName:%s\n password:%s\n" , url , userName , password);
        System.out.println(url + " " + userName + " " + password);
        System.out.printf("--------------%s saved to database------------------\n" , vehicle.getBrand());
    }


}
