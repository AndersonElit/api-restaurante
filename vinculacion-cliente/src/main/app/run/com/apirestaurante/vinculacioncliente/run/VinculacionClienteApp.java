package com.apirestaurante.vinculacioncliente.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.apirestaurante.vinculacioncliente.*"})
public class VinculacionClienteApp {
    public static void main(String[] args) {
        SpringApplication.run(VinculacionClienteApp.class, args);
    }
}
