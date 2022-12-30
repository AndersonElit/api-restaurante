package com.apirestaurante.reservas.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "${client.post.name}",
        url = "${client.post.baseUrl}")
public interface VinculacionClienteClient {

    @GetMapping("/saludo-cliente")
    public String saludoVinculacionCliente();

}
