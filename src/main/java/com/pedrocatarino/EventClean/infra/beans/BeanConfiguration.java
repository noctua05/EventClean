package com.pedrocatarino.EventClean.infra.beans;

import com.pedrocatarino.EventClean.core.entities.Evento;
import com.pedrocatarino.EventClean.core.getway.EventoGatewey;
import com.pedrocatarino.EventClean.core.usecases.BuscarEventoUseCase;
import com.pedrocatarino.EventClean.core.usecases.BuscarEventoUseCaseImpl;
import com.pedrocatarino.EventClean.core.usecases.CriarEventoUseCase;
import com.pedrocatarino.EventClean.core.usecases.CriarEventoUseCaseImpl;
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

}