package com.pedrocatarino.EventClean.infra.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<EventoEntity,Long > {
}
