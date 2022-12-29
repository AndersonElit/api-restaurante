package com.apirestaurante.reservas.config;

import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.cloud.openfeign.clientconfig.FeignClientConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
public class ReservasConfig {

    @Bean
    public FeignClientConfigurer feignClientConfigurer() {
        return new FeignClientConfigurer() {

            @Override
            public boolean inheritParentConfiguration() {
                return false;
            }
        };

    }


}
