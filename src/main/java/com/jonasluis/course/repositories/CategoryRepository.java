package com.jonasluis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonasluis.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
