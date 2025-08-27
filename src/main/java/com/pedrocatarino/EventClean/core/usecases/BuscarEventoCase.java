package com.pedrocatarino.EventClean.core.usecases;

import com.pedrocatarino.EventClean.core.entities.Evento;

public interface BuscarEventoCase {

    public Evento execute(Evento evento);
}
