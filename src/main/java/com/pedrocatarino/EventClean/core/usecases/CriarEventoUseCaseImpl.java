package com.pedrocatarino.EventClean.core.usecases;

import com.pedrocatarino.EventClean.core.entities.Evento;
import com.pedrocatarino.EventClean.core.getway.EventoGatewey;
import com.pedrocatarino.EventClean.infra.exceptions.IdentificadorDuplicadoException;

public class CriarEventoUseCaseImpl implements CriarEventoUseCase {

    private final EventoGatewey eventoGatewey;

    public CriarEventoUseCaseImpl(EventoGatewey eventoGatewey) {
        this.eventoGatewey = eventoGatewey;
    }

    @Override
    public Evento execute(Evento evento) {

        if(eventoGatewey.existeIdentificador(evento.getIdentificador())){
            throw new IdentificadorDuplicadoException("Esse identificador já está sendo usado.");
        }
        return eventoGatewey.cria(evento);
    }
    
}
