package com.miniprojectspringboot.springboot;

import com.miniprojectspringboot.springboot.entities.Category;
import com.miniprojectspringboot.springboot.entities.Product;
import com.miniprojectspringboot.springboot.repositories.CategoryRepository;
import com.miniprojectspringboot.springboot.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Locale;

/**
 * Aula by Prof. Nélio
 */
@SpringBootApplication
public class SpringbootApplication implements CommandLineRunner {
    //usando previamente a interface commandLineRunner para startar um objeto category .
    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Category cat1 = new Category(1L, "Electronics");
        Category cat2 = new Category(2L, "Smartphones");

        Product p1 = new Product(1L, "TV Samnsung 53", 3590.90, cat1);
        Product p2 = new Product(2L, "Home Theater LG ", 990.00, cat1);
        Product p3 = new Product(3L, "Iphone 12", 9890.00, cat2);
        Product p4 = new Product(4L, "Samsung M31 S ", 1560.00, cat2);

        cat1.getProducts().addAll(Arrays.asList(p1, p2));
        cat1.getProducts().addAll(Arrays.asList(p3, p4));

        categoryRepository.save(cat1);
        categoryRepository.save(cat2);

        productRepository.save(p1);
        productRepository.save(p2);
        productRepository.save(p3);
        productRepository.save(p4);
    }
}
