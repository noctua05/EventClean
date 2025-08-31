package com.pedrocatarino.EventClean.core.usecases;

import com.pedrocatarino.EventClean.core.entities.Evento;
import com.pedrocatarino.EventClean.core.getway.EventoGatewey;

public class BuscarEventoPeloIdentificadorUseCaseImpl implements BuscarEventoPeloIdentificadorUseCase {

    private final EventoGatewey eventoGatewey;

    public BuscarEventoPeloIdentificadorUseCaseImpl(EventoGatewey eventoGatewey) {
        this.eventoGatewey = eventoGatewey;
    }

    @Override
    public Evento execute(String identificador) {
        return eventoGatewey.findByIdentificador(identificador);
    }

}
