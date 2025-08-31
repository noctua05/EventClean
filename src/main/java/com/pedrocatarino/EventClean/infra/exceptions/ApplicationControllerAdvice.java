package com.pedrocatarino.EventClean.infra.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.util.Map;

@RestControllerAdvice
public class ApplicationControllerAdvice {

    @ExceptionHandler(IdentificadorDuplicadoException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public Map<String, String> handleIdentificadorDuplicado(IdentificadorDuplicadoException ex) {
        return Map.of("error", ex.getMessage());
    }

    @ExceptionHandler(IdentificadorNaoEncontradoException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String, String> handleIdentificadorNaoEncontrado(IdentificadorNaoEncontradoException ex) {
        return Map.of("error", ex.getMessage());

    }
}
