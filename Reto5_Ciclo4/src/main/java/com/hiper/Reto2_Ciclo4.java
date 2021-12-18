package com.hiper;


import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

import com.hiper.repository.crud.InterfaceVegetarian;
import com.hiper.repository.crud.OrderCrudRepository;
import com.hiper.repository.crud.UserCrudRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author Juan pablo Roa Fragozo
 */

@SpringBootApplication
public class Reto2_Ciclo4 implements CommandLineRunner {

    @Autowired
    private UserCrudRepository userRepo;

    @Autowired
    private InterfaceVegetarian supRepo;

    @Autowired
    private OrderCrudRepository orderRepo;

    public static void main(String[] args) {
        SpringApplication.run(Reto2_Ciclo4.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        

        orderRepo.deleteAll();
        userRepo.deleteAll();
        supRepo.deleteAll();

    }

}
