package com.codeElevate.ServiceBookingSystem.entity;

import com.codeElevate.ServiceBookingSystem.enums.userRole;
import jakarta.persistence.*;
import lombok.Data;

//Entity annotation -> Signals the JPA provider to tell them that the class should be treated as a table in a database
@Entity
@Table(name = "users")

//Data annotation -> Shortcut to get  the Getter and Setter
@Data

public class User {
//    Define the properties needed

    //    @Id annotation -> Used to indicate the primary key of an entity
    @Id

    // @GeneratedValue -> It will use auto increment method in the Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String email;

    private String password;

    private String name;

    private String lastname;

    private String phone;

    private userRole role;

}
