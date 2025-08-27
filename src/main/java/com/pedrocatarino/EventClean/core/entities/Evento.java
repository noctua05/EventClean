package com.pedrocatarino.EventClean.core.entities;

import com.pedrocatarino.EventClean.core.entities.enums.TipoEvento;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDateTime;

public class Evento {

    Long id;

    String name;

    String descricao;

    String local;

    String organizador;

    String identificador;

    LocalDateTime DataInicio;

    LocalDateTime DataFim;

    Long capacidade;

    @Enumerated(EnumType.STRING)
    TipoEvento tipo;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        DataInicio = dataInicio;
    }

    public void setDataFim(LocalDateTime dataFim) {
        DataFim = dataFim;
    }

    public void setCapacidade(Long capacidade) {
        this.capacidade = capacidade;
    }

    public void setTipo(TipoEvento tipo) {
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getLocal() {
        return local;
    }

    public String getOrganizador() {
        return organizador;
    }

    public String getIdentificador() {
        return identificador;
    }

    public LocalDateTime getDataInicio() {
        return DataInicio;
    }

    public LocalDateTime getDataFim() {
        return DataFim;
    }

    public Long getCapacidade() {
        return capacidade;
    }

    public TipoEvento getTipo() {
        return tipo;
    }
}
