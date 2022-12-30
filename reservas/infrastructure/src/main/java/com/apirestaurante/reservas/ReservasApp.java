package com.apirestaurante.reservas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ReservasApp {
    public static void main(String[] args) {
        SpringApplication.run(ReservasApp.class, args);
    }
}
