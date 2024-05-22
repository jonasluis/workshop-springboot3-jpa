package com.jonasluis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonasluis.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
