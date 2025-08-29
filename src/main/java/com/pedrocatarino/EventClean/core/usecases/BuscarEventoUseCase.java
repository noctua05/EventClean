package com.pedrocatarino.EventClean.core.usecases;

import com.pedrocatarino.EventClean.core.entities.Evento;

import java.util.List;

public interface BuscarEventoUseCase {
    public List<Evento> execute();
}
