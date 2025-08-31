package com.pedrocatarino.EventClean.infra.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EventoRepository extends JpaRepository<EventoEntity,Long > {

    boolean existsByIdentificador(String identificador);
    Optional<EventoEntity> findByIdentificador(String identificador);
}
