package com.pedrocatarino.EventClean.infra.presentation;

import com.pedrocatarino.EventClean.core.entities.Evento;
import com.pedrocatarino.EventClean.core.usecases.BuscarEventoUseCase;
import com.pedrocatarino.EventClean.core.usecases.CriarEventoUseCase;
import com.pedrocatarino.EventClean.infra.dtos.EventoDto;
import com.pedrocatarino.EventClean.infra.mappers.EventoDtoMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1/")
public class EventoController {

    private final EventoDtoMapper mapper;
    private final CriarEventoUseCase criarEventoUseCase;
    private final BuscarEventoUseCase buscarEventoUseCase;

    public EventoController(EventoDtoMapper mapper, CriarEventoUseCase criarEventoUseCase, BuscarEventoUseCase buscarEventoUseCase ) {
        this.mapper = mapper;
        this.criarEventoUseCase = criarEventoUseCase;
        this.buscarEventoUseCase= buscarEventoUseCase;
    }

    @PostMapping("criarevento")
    public ResponseEntity<Map<String,Object>> criarEvento(@RequestBody EventoDto dto){
        Evento evento = criarEventoUseCase.execute(mapper.toEvento(dto));
        Map<String,Object> resposta = new HashMap<>();
        resposta.put("Mensagem: ","Seu evento foi salvo corretamente");
        resposta.put("evento: ",mapper.toEventoDto(evento));
        return ResponseEntity.ok(resposta);
    }

    @GetMapping("buscaeventos")
    public ResponseEntity<List<EventoDto>> buscaEventos(){
        List<EventoDto> listDto = buscarEventoUseCase.execute().stream()
                .map(mapper::toEventoDto)
                .toList();

        return  ResponseEntity.ok(listDto);
    }

}
