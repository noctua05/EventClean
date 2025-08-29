package com.pedrocatarino.EventClean.core.usecases;

import com.pedrocatarino.EventClean.core.entities.Evento;
import com.pedrocatarino.EventClean.core.getway.EventoGatewey;

public class CriarEventoUseCaseImpl implements CriarEventoUseCase {

    private final EventoGatewey eventoGatewey;

    public CriarEventoUseCaseImpl(EventoGatewey eventoGatewey) {
        this.eventoGatewey = eventoGatewey;
    }

    @Override
    public Evento execute(Evento evento) {
            return eventoGatewey.cria(evento);
    }

}
