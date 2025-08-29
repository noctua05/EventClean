package com.pedrocatarino.EventClean.core.getway;

import com.pedrocatarino.EventClean.core.entities.Evento;

import java.util.List;

public interface EventoGatewey {

    public void delete(Long id);

    public Evento cria(Evento evento);

    public List<Evento> busca();
}
