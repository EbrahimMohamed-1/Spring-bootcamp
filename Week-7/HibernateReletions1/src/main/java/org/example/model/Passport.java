package org.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


import java.util.Date;

@Entity
@Table(name = "passport")
@Getter
@Setter
@NoArgsConstructor

public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "person_id")

    private Person person;
    private String passport_number;
    private String expiry_date;

    public Passport(Person person, String passport_number, String expiry_date) {
        this.person = person;
        this.passport_number = passport_number;
        this.expiry_date = expiry_date;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id=" + id +
                ", passport_number='" + passport_number + '\'' +
                ", expiry_date='" + expiry_date + '\'' +
                '}';
    }
}
