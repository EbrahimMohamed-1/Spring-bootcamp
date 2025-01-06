package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Setter
@Getter
@NoArgsConstructor
public class User {
    @Id
//    ->work with PostgreSQL or Oracle
//    @SequenceGenerator(name = "seqGen", sequenceName = "mySeq", initialValue = 1, allocationSize = 50)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)

//    ->work with any type of database, and we can change database type or for databases that don’t support sequences or auto-increment
//    @GeneratedValue(generator = "User_ID" ,strategy = GenerationType.TABLE)
//    @TableGenerator(name = "User_ID",allocationSize = 1, initialValue = 0)
    //IDENTITY work with (same as database do) auto increment column in table

    // create auto increment ID for all database tables
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    // without @columns because it has the same name in database
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password =password;
    }
}
