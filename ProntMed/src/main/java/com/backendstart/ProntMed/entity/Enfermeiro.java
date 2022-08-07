package com.backendstart.ProntMed.entity;

import javax.persistence.Column;
import java.time.LocalDate;

public class Enfermeiro {

    @Column(nullable = false, name = "COREM")
    private String crm;

    @Column(nullable = false, name = "local_emissao")
    private LocalDate localEmissao;

    @Column(nullable = false, name="data_emissao")
    private LocalDate dataEmissao;

    @Column(nullable = false, name = "senha")
    private String senha;

    @Column(nullable = false, name = "pessoa_cpf")
    private String cpfEmfermeiro;


    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public LocalDate getLocalEmissao() {
        return localEmissao;
    }

    public void setLocalEmissao(LocalDate localEmissao) {
        this.localEmissao = localEmissao;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpfEmfermeiro() {
        return cpfEmfermeiro;
    }

    public void setCpfEmfermeiro(String cpfEmfermeiro) {
        this.cpfEmfermeiro = cpfEmfermeiro;
    }
}
