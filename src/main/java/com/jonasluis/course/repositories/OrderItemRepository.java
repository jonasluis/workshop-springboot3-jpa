package com.jonasluis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonasluis.course.entities.OrderItem;
import com.jonasluis.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

	
}
