package com.pedrocatarino.EventClean.infra.exceptions;

public class IdentificadorNaoEncontradoException extends RuntimeException {
    public IdentificadorNaoEncontradoException(String message) {
        super(message);
    }
}
