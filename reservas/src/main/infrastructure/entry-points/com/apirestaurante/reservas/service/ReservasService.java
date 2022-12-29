package com.apirestaurante.reservas.service;

import com.apirestaurante.reservas.clients.VinculacionClienteClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ReservasService {

    private final VinculacionClienteClient vinculacionClienteClient;

    public String saludoVinculacionCliente() {
        return vinculacionClienteClient.saludoVinculacionCliente();
    }

}
