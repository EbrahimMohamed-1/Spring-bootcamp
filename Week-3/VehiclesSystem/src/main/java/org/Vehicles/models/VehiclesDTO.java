package org.Vehicles.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Date;

@Setter
@Getter
@ToString
@RequiredArgsConstructor
@Component
@Scope( "prototype")
public class VehiclesDTO {
    private int id;
    private String brand;
    private String type;
    private Date joiningDate;

    public VehiclesDTO( int id, String brand, String type, Date joiningDate){
        this.id = id;
        this.brand = brand;
        this.type =  type;
    }
}
