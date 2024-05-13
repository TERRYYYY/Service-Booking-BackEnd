package com.codeElevate.ServiceBookingSystem.services.authentication;

import com.codeElevate.ServiceBookingSystem.dto.SignupRequestDTO;
import com.codeElevate.ServiceBookingSystem.dto.UserDTO;

public interface AuthService {
    UserDTO signupClient (SignupRequestDTO signupRequestDTO);
}
