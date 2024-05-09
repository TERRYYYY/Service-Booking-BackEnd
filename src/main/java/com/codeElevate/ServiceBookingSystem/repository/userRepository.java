package com.codeElevate.ServiceBookingSystem.repository;

import com.codeElevate.ServiceBookingSystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// @Repository annotation -> Used to indicate that the class provides operations like for storage, retrieval, search, update and delete on objects
@Repository

public interface userRepository extends JpaRepository<User, Long> {
}
