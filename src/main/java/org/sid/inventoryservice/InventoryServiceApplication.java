package org.sid.inventoryservice;

import org.sid.inventoryservice.Entity.Prodect;
import org.sid.inventoryservice.Repository.ProdectRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ProdectRepository productRepository){
        return args -> {
            productRepository.save(new Prodect(null,"Computer Desk Top HP",900));
            productRepository.save(new Prodect(null,"Printer Epson",80));
            productRepository.save(new Prodect(null,"MacBook Pro Lap Top",1800));
            productRepository.findAll().forEach(System.out::println);
        };
    }

}
