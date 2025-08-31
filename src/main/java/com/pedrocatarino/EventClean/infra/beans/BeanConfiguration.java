package com.pedrocatarino.EventClean.infra.beans;

import com.pedrocatarino.EventClean.core.entities.Evento;
import com.pedrocatarino.EventClean.core.getway.EventoGatewey;
import com.pedrocatarino.EventClean.core.usecases.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CriarEventoUseCase criarEventoUseCase(EventoGatewey eventoGatewey) {
        return new CriarEventoUseCaseImpl(eventoGatewey);
    }

    @Bean
    public BuscarEventoUseCase buscarEventoUseCase(EventoGatewey eventoGatewey){
        return new BuscarEventoUseCaseImpl(eventoGatewey);
    }

    @Bean
    public BuscarEventoPeloIdentificadorUseCase buscarEventoPeloIdentificadorUseCase(EventoGatewey eventoGatewey){
        return new BuscarEventoPeloIdentificadorUseCaseImpl(eventoGatewey);
    }

}