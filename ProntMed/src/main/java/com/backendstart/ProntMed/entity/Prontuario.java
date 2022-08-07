package com.backendstart.ProntMed.entity;

import javax.persistence.*;

public class Prontuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProntuario;

    @ManyToMany
    @Column(nullable = false, name = "medico_pessoa_cpf")
    private Pessoa cpfMedico;

    @ManyToMany
    @Column(nullable = false, name = "paciente_pessoa_id")
    private Pessoa cpfpessoa;

    @ManyToMany
    @Column(nullable = false, name = "enfermeiro_pessoa_cpf")
    private Pessoa cpfEnfermeiro;


    //getters and setters

    public Long getIdProntuario() {
        return idProntuario;
    }

    public void setIdProntuario(Long idProntuario) {
        this.idProntuario = idProntuario;
    }

    public Pessoa getCpfMedico() {
        return cpfMedico;
    }

    public void setCpfMedico(Pessoa cpfMedico) {
        this.cpfMedico = cpfMedico;
    }

    public Pessoa getCpfpessoa() {
        return cpfpessoa;
    }

    public void setCpfpessoa(Pessoa cpfpessoa) {
        this.cpfpessoa = cpfpessoa;
    }

    public Pessoa getCpfEnfermeiro() {
        return cpfEnfermeiro;
    }

    public void setCpfEnfermeiro(Pessoa cpfEnfermeiro) {
        this.cpfEnfermeiro = cpfEnfermeiro;
    }
}