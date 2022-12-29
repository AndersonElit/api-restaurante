package com.apirestaurante.reservas.controller;

import com.apirestaurante.reservas.clients.VinculacionClienteClient;
import com.apirestaurante.reservas.service.ReservasService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/reservas")
@AllArgsConstructor
public class ReservasController {

    //private final VinculacionClienteClient vinculacionClienteClient;
    private final ReservasService reservasService;

    @GetMapping("/saludo-reservas")
    public String saludar() {
        return "Hola desde reservas";
    }

    @GetMapping("/saludo-cliente")
    public String saludoVinculacionCliente() {
        //return vinculacionClienteClient.saludoVinculacionCliente();
        return reservasService.saludoVinculacionCliente();
    }

}
