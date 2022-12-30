package com.apirestaurante.vinculacioncliente.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/vinculacion-cliente")
public class VinculacionClienteController {

    @GetMapping("/saludo-cliente")
    public String saludar() {
        return "Hola desde vinculacion cliente";
    }

}
