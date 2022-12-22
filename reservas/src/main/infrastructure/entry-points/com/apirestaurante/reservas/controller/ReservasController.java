package com.apirestaurante.reservas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/reservas")
public class ReservasController {

    @GetMapping("/saludo-reservas")
    public String saludar() {
        return "Hola desde reservas";
    }

}
