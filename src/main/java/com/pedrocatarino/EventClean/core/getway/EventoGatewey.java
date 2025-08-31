package com.pedrocatarino.EventClean.core.getway;

import com.pedrocatarino.EventClean.core.entities.Evento;

import java.util.List;

public interface EventoGatewey {

     void delete(Long id);

     Evento cria(Evento evento);

    List<Evento> busca();

    boolean existeIdentificador(String identificador);

    Evento findByIdentificador(String identificador);
}
