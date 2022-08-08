package com.backendstart.ProntMed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "transferencia")
public class Transferencia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_transferencia;

    @Column(nullable = false, name = "unidade_solicitada")
    private String unidadeSolicitada;

    @Column(nullable = false, name = "data_solicitacao")
    private LocalDate dataSoliticacao;

    @Column(nullable = false, name = "relatorio_transferencia")
    private String relatorioTransferencia;
}

