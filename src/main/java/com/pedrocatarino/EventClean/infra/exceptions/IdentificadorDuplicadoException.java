package com.pedrocatarino.EventClean.infra.exceptions;

public class IdentificadorDuplicadoException extends RuntimeException {
    public IdentificadorDuplicadoException(String message) {
        super(message);
    }
}
