package com.cheikhou.ly.backend;
import com.cheikhou.ly.backend.entities.Product;
import com.cheikhou.ly.backend.entities.ProductType;
import com.cheikhou.ly.backend.entities.Role;
import com.cheikhou.ly.backend.entities.User;
import com.cheikhou.ly.backend.services.interfaces.ProductService;
import com.cheikhou.ly.backend.services.interfaces.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Date;

@SpringBootApplication
@RequiredArgsConstructor
public class BackendModelsisApplication implements CommandLineRunner {

    private final ProductService productService;
    private final UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(BackendModelsisApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
/*

        ProductType t1 = productService.addTypeProduct(new ProductType(null,"Smartphone", new ArrayList<>()));
        ProductType t2 = productService.addTypeProduct(new ProductType(null,"Laptop", new ArrayList<>()));

        productService.addProduct(new Product(null,"iphone",new Date(),t1));
        productService.addProduct(new Product(null,"MacBook Air",new Date(),t2));


        userService.addNewRole(new Role(null,"ADMIN"));
        userService.addNewRole(new Role(null,"USER"));

        userService.addNewUser(new User(null,"diop","tafa","taf","pwd", new ArrayList<>()));
        userService.addNewUser(new User(null,"tall","penda","pen","pwd", new ArrayList<>()));
        userService.addNewUser(new User(null,"ba","iba","ibs","pwd", new ArrayList<>()));

*/


        //userService.addRoleToUser("taf","ADMIN");
        //userService.addRoleToUser("pen","USER");


    }
}
