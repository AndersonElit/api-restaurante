package com.apirestaurante.reservas.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.apirestaurante.reservas.*"})
public class ReservasApp {
    public static void main(String[] args) {
        SpringApplication.run(ReservasApp.class, args);
    }
}
