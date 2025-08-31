package com.pedrocatarino.EventClean.core.usecases;

import com.pedrocatarino.EventClean.core.entities.Evento;

public interface BuscarEventoPeloIdentificadorUseCase {
    public Evento execute(String identificador);
}
