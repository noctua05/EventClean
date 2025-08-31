package com.pedrocatarino.EventClean.infra.getway;

import com.pedrocatarino.EventClean.core.entities.Evento;
import com.pedrocatarino.EventClean.core.getway.EventoGatewey;
import com.pedrocatarino.EventClean.infra.exceptions.IdentificadorNaoEncontradoException;
import com.pedrocatarino.EventClean.infra.mappers.EventoEntityMapper;
import com.pedrocatarino.EventClean.infra.persistence.EventoEntity;
import com.pedrocatarino.EventClean.infra.persistence.EventoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EventoRepositoryGateway implements EventoGatewey {


    private final EventoRepository eventoRepository;
    private final EventoEntityMapper mapper;

    public EventoRepositoryGateway(EventoRepository eventoRepository, EventoEntityMapper mapper) {
        this.eventoRepository = eventoRepository;
        this.mapper = mapper;
    }


    @Override
    public void delete(Long id) {

    }

    @Override
    public Evento cria(Evento evento) {
        try {
            EventoEntity entity = mapper.toEntity(evento);
            return mapper.toEvento(eventoRepository.save(entity));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Evento> busca() {
        return eventoRepository.findAll().stream()
                .map(mapper::toEvento)
                .toList();
    }

    @Override
    public boolean existeIdentificador(String identificador) {
        return eventoRepository.findByIdentificador(identificador).isPresent();
    }

    @Override
    public Evento findByIdentificador(String identificador) {

       Optional<EventoEntity> optEntity = eventoRepository.findByIdentificador(identificador);
        EventoEntity entity = eventoRepository.findByIdentificador(identificador)
                .orElseThrow(()-> new IdentificadorNaoEncontradoException("Não há nenhum evento com esse identificador."));

        return mapper.toEvento(entity);
    }
}
