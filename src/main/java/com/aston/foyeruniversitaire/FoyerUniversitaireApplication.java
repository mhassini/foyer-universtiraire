package com.aston.foyeruniversitaire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAspectJAutoProxy
public class FoyerUniversitaireApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoyerUniversitaireApplication.class, args);
    }

}
