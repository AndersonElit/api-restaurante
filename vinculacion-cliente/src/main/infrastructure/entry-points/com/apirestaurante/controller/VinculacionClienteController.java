package com.apirestaurante.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/vinculacion-cliente")
public class VinculacionClienteController {

    @GetMapping("/saludoCliente")
    public String saludar() {
        return "Hola, como estas, bn bn";
    }

}
