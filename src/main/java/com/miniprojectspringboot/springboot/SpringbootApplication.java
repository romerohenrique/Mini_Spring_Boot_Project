package com.miniprojectspringboot.springboot;

import com.miniprojectspringboot.springboot.entities.Category;
import com.miniprojectspringboot.springboot.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class SpringbootApplication implements CommandLineRunner {
//usando previamente a interface commandLineRunner para startar um objeto category .
    @Autowired
    private CategoryRepository categoryRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Category cat1 = new Category(1L, "Electronics");
        Category cat2 = new Category(2L, "Smartphones");
        categoryRepository.save(cat1);
        categoryRepository.save(cat2);
    }
}
