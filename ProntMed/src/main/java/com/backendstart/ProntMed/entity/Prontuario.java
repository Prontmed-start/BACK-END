package com.backendstart.ProntMed.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Prontuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProntuario;

    @Column(nullable = false, name = "tratamentos_esteticos")
    private boolean tratamentosEsteticos;


}
