package com.pedrocatarino.EventClean.core.usecases;

import com.pedrocatarino.EventClean.core.entities.Evento;
import com.pedrocatarino.EventClean.core.getway.EventoGatewey;

import java.util.List;

public class BuscarEventoUseCaseImpl implements BuscarEventoUseCase {

    private final EventoGatewey eventoGatewey;

    public BuscarEventoUseCaseImpl(EventoGatewey eventoGatewey) {
        this.eventoGatewey = eventoGatewey;
    }

    @Override
    public List<Evento> execute() {
        return eventoGatewey.busca();
    }
}
