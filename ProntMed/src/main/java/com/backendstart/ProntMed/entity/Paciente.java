package com.backendstart.ProntMed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, name = "paciente")
    private String paciente;

    @Column(nullable = false, name = "pessoa_cpf")
    private String pessoaCpf;

}


