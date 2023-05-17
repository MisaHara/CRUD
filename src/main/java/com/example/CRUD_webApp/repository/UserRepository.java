package com.example.CRUD_webApp.repository;

import com.example.CRUD_webApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
