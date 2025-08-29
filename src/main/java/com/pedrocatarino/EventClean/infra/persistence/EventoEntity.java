package com.pedrocatarino.EventClean.infra.persistence;

import com.pedrocatarino.EventClean.core.entities.enums.TipoEvento;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;



@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "Eventos")
public class EventoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    @Column(name = "local_evento", nullable = false)
    private String localEvento;

    @Column(nullable = false)
    private String organizador;

    @Column(nullable = false, unique = true)
    private String identificador;

    @Column(name = "data_inicio", nullable = false)
    private LocalDateTime dataInicio;

    @Column(name = "data_fim", nullable = false)
    private LocalDateTime dataFim;

    @Column(nullable = false)
    private Long capacidade;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoEvento tipo;

    public EventoEntity(String nome, String descricao, String localEvento, String organizador, String identificador, LocalDateTime dataInicio, LocalDateTime dataFim, Long capacidade, TipoEvento tipo) {
        this.nome = nome;
        this.descricao = descricao;
        this.localEvento = localEvento;
        this.organizador = organizador;
        this.identificador = identificador;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.capacidade = capacidade;
        this.tipo = tipo;
    }
}
