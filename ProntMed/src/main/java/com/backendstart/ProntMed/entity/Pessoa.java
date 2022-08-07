package com.backendstart.ProntMed.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @Column(nullable = false, name ="cpf")
    private String cpf;

    @Column(nullable = false, name = "nome_pessoa")
    private String nome_pessoa;

    @Column(nullable = false, name = "data_nasc")
    private LocalDate dataNasci;

    @Column(nullable = false, name = "email")
    private String email;

    @Column(nullable = false, name= "telefone")
    private String telefone;

    @Column(nullable = false, name ="genero")
    private LocalDate genero;


    public String getNome_pessoa() {
        return nome_pessoa;
    }

    public LocalDate getData_nasci() {
        return dataNasci;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public LocalDate getGenero() {
        return genero;
    }

    public void setNome_pessoa(String nome_pessoa) {
        this.nome_pessoa = nome_pessoa;
    }

    public void setData_nasci(LocalDate data_nasci) {
        this.dataNasci = data_nasci;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setGenero(LocalDate genero) {
        this.genero = genero;
    }
}