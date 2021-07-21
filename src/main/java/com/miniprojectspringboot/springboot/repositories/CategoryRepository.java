package com.miniprojectspringboot.springboot.repositories;

import com.miniprojectspringboot.springboot.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
