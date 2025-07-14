package com.m104.foyeruniversitaire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class FoyerUniversitaireApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoyerUniversitaireApplication.class, args);
    }

}
