package com.backendstart.ProntMed.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "exame")
public class Exame {

    @Id
    @Column(nullable = false, name = "id_exame")
    private String exame;

    @Column(nullable = false, name = "tipo_exame")
    private String tipoExame;

    @Column(nullable = false, name = "relatorio_exame")
    private LocalDate relatorioExame;

    @Column(nullable = false, name = "prontuario_idprontuario")
    private String prontuarioIdProntuario;

    @OneToMany
    @Column(nullable = false, name = "prontuario_paciente_pessoa_id")
    private Pessoa cpf ;

    @OneToOne
    @Column(nullable = false, name = "prontuario_idprontuario")
    private Prontuario prontuario;

    @ManyToMany
    @Column(nullable = false, name = "prontuario_medico_pessoa_cpf")
    private Prontuario medicoPessoaCpf;


    @Column(nullable = false, name = "id_exames")
    private LocalDate idExames;


    public String getTipoExame() {
        return tipoExame;
    }

    public LocalDate getRelatorioExame() {
        return relatorioExame;
    }

    public String getProntuarioIdProntuario() {
        return prontuarioIdProntuario;
    }


    public LocalDate getIdExames() {
        return idExames;
    }
    public void setTipoExame(String tipoExame) {
        this.tipoExame = tipoExame;
    }

    public void setRelatorioExame(LocalDate relatorioExame) {
        this.relatorioExame = relatorioExame;
    }

    public void setProntuarioIdProntuario(String prontuarioIdProntuario) {
        this.prontuarioIdProntuario = prontuarioIdProntuario;
    }

    public void setIdExames(LocalDate idExames) {
        this.idExames = idExames;
    }

    public String getExame() {
        return exame;
    }

    public Pessoa getCpf() {
        return cpf;
    }

    public void setExame(String exame) {
        this.exame = exame;
    }

    public void setCpf(Pessoa cpf) {
        this.cpf = cpf;
    }

    public Prontuario getProntuario() {
        return prontuario;
    }

    public Prontuario getMedicoPessoaCpf() {
        return medicoPessoaCpf;
    }

    public void setProntuario(Prontuario prontuario) {
        this.prontuario = prontuario;
    }

    public void setMedicoPessoaCpf(Prontuario medicoPessoaCpf) {
        this.medicoPessoaCpf = medicoPessoaCpf;
    }
}