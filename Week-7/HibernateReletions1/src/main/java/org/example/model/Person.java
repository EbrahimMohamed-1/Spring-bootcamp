package org.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "person")
@Setter
@Getter
@NoArgsConstructor

public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String first_name;
    private String last_name;
    private String date_of_birth;
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "person") // mapped by person reference in Passport class
    private Passport passport;

    public Person( String firstName, String lastName, String birthDay) {
        first_name = firstName;
        last_name = lastName;
        date_of_birth = birthDay;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", date_of_birth='" + date_of_birth  +
                '}';
    }
}
