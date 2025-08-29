package com.pedrocatarino.EventClean.infra.dtos;
import com.pedrocatarino.EventClean.core.entities.enums.TipoEvento;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record EventoDto(Long id,
                        String name,
                        String descricao,
                        String local,
                        String organizador,
                        String identificador,
                        LocalDateTime dataInicio,
                        LocalDateTime dataFim,
                        Long capacidade,
                        TipoEvento tipo
                        ) {
}
