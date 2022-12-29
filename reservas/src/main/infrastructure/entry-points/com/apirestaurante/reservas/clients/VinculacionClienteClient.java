package com.apirestaurante.reservas.clients;

import com.apirestaurante.reservas.config.ReservasConfig;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "${client.post.name}",
        url = "${client.post.baseUrl}",
        configuration = ReservasConfig.class)
public interface VinculacionClienteClient {

    @GetMapping("/saludo-cliente")
    public String saludoVinculacionCliente();

}
