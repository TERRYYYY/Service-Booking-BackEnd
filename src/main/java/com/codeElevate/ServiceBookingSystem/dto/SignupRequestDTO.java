package com.codeElevate.ServiceBookingSystem.dto;

import com.codeElevate.ServiceBookingSystem.enums.userRole;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

//@Data annotation -> Shortcut to get the Getter and Setter
@Data
public class SignupRequestDTO {
//    Define the properties needed
    private long id;

    private String email;

    private String password;

    private String name;

    private String lastname;

    private String phone;
}
