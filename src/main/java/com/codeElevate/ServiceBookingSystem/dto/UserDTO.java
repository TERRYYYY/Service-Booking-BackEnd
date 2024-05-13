package com.codeElevate.ServiceBookingSystem.dto;

import com.codeElevate.ServiceBookingSystem.enums.userRole;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

//WHAT IS DTO?
//A data transfer object (DTO) is an object that carries data between processes.


//@Data annotation -> Shortcut to get the Getter and Setter
@Data
public class UserDTO {
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
