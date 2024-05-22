package com.jonasluis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonasluis.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
