package com.pedrocatarino.EventClean.infra.mappers;

import com.pedrocatarino.EventClean.core.entities.Evento;
import com.pedrocatarino.EventClean.infra.persistence.EventoEntity;
import org.springframework.stereotype.Component;


@Component
public class EventoEntityMapper {

    public EventoEntity toEntity(Evento evento) {
        return new EventoEntity(
                evento.getName(),
                evento.getDescricao(),
                evento.getLocal(),
                evento.getOrganizador(),
                evento.getIdentificador(),
                evento.getDataInicio(),
                evento.getDataFim(),
                evento.getCapacidade(),
                evento.getTipo()
        );
    }

    public Evento toEvento(EventoEntity entity) {
        return new Evento(
                entity.getId(),
                entity.getNome(),
                entity.getDescricao(),
                entity.getLocalEvento(),
                entity.getOrganizador(),
                entity.getIdentificador(),
                entity.getDataInicio(),
                entity.getDataFim(),
                entity.getCapacidade(),
                entity.getTipo()
        );
    }

}
