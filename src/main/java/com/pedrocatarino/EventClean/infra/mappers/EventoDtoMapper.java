package com.pedrocatarino.EventClean.infra.mappers;

import com.pedrocatarino.EventClean.core.entities.Evento;
import com.pedrocatarino.EventClean.infra.dtos.EventoDto;
import org.springframework.stereotype.Component;

@Component
public class EventoDtoMapper {

    public EventoDto toEventoDto(Evento evento){

        return EventoDto.builder()
                .id(evento.getId())
                .name(evento.getName())
                .descricao(evento.getDescricao())
                .local(evento.getLocal())
                .organizador(evento.getOrganizador())
                .identificador(evento.getIdentificador())
                .local(evento.getLocal())
                .dataInicio(evento.getDataInicio())
                .dataFim(evento.getDataFim())
                .capacidade(evento.getCapacidade())
                .tipo(evento.getTipo())
                .build();
    }

    public Evento toEvento(EventoDto dto) {
        Evento evento = new Evento();
        evento.setName(dto.name());
        evento.setDescricao(dto.descricao());
        evento.setLocal(dto.local());
        evento.setOrganizador(dto.organizador());
        evento.setIdentificador(dto.identificador());
        evento.setDataInicio(dto.dataInicio());
        evento.setDataFim(dto.dataFim());
        evento.setCapacidade(dto.capacidade());
        evento.setTipo(dto.tipo());
        return evento;
    }

}
