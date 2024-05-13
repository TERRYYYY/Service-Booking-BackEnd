package com.codeElevate.ServiceBookingSystem.services.authentication;

import com.codeElevate.ServiceBookingSystem.dto.SignupRequestDTO;
import com.codeElevate.ServiceBookingSystem.dto.UserDTO;
import com.codeElevate.ServiceBookingSystem.entity.User;
import com.codeElevate.ServiceBookingSystem.enums.userRole;
import com.codeElevate.ServiceBookingSystem.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service annotation -> Used with classes that provide business functionalities
@Service

// So this class implements AuthService which is an interface.
// What is that? -> When it implements, it means that it can inherit the accessible features
public class AuthServiceImplementation implements AuthService {

    //Injecting the user repository in the service

    // Autowired annotation -> Used to automatically wire required dependencies
    @Autowired
    private userRepository userRepository;

    //The method below is for the sign up of the client -> It will return sign up DTO
    public UserDTO signupClient (SignupRequestDTO signupRequestDTO){
        User user = new User();

        user.setName(signupRequestDTO.getName());
        user.setLastname(signupRequestDTO.getLastname());
        user.setEmail(signupRequestDTO.getEmail());
        user.getPhone(signupRequestDTO.getPhone());
        user.setPassword(signupRequestDTO.getPassport());

        user.setRole(userRole.CLIENT);

        return userRepository.save(user).getDto();

    }
}
