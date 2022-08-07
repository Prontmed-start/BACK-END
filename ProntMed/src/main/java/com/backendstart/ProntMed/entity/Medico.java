package com.backendstart.ProntMed.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "medico")
public class Medico {

    @OneToOne
    @Column(nullable = false, name = "pessoa_cpf")
    private Pessoa cpf;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, name = "crm")
    private String crm;

    @Column(nullable = false, name = "local_emissao")
    private LocalDate localEmissao;

    @Column(nullable = false, name="data_emissao")
    private LocalDate dataEmissao;

    @Column(nullable = false, name = "senha")
    private String senha;

    public Long getId() {
        return id;
    }

    public String getCrm() {
        return crm;
    }

    public LocalDate getLocalEmissao() {
        return localEmissao;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public String getSenha() {
        return senha;
    }



    public void setId(Long id) {
        this.id = id;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public void setLocalEmissao(LocalDate localEmissao) {
        this.localEmissao = localEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Pessoa getCpf() {
        return cpf;
    }

    public void setCpf(Pessoa cpf) {
        this.cpf = cpf;
    }
}