package com.backendstart.ProntMed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "tb_pessoa")
public class Exame {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, name = "tipo_exame")
    private String tipoExame;

    @Column(nullable = false, name = "relatorio_exame")
    private LocalDate relatorioExame;

    @Column(nullable = false, name = "prontuario_idprontuario")
    private String prontuarioIdProntuario;

    @Column(nullable = false, name = "prontuario_paciente_pessoa_id")
    private String prontuarioPacientePessoaId;

    @Column(nullable = false, name = "prontuario_medico_pessoa_cpf")
    private String prontuarioMedicoPessoaCpf;

    @Column(nullable = false, name = "id_exames")
    private LocalDate idExames;

    public Long getId() {
        return id;
    }

    public String getTipoExame() {
        return tipoExame;
    }

    public LocalDate getRelatorioExame() {
        return relatorioExame;
    }

    public String getProntuarioIdProntuario() {
        return prontuarioIdProntuario;
    }

    public String getProntuarioPacientePessoaId() {
        return prontuarioPacientePessoaId;
    }

    public String getProntuarioMedicoPessoaCpf() {
        return prontuarioMedicoPessoaCpf;
    }

    public LocalDate getIdExames() {
        return idExames;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setProntuarioPacientePessoaId(String prontuarioPacientePessoaId) {
        this.prontuarioPacientePessoaId = prontuarioPacientePessoaId;
    }

    public void setProntuarioMedicoPessoaCpf(String prontuarioMedicoPessoaCpf) {
        this.prontuarioMedicoPessoaCpf = prontuarioMedicoPessoaCpf;
    }

    public void setIdExames(LocalDate idExames) {
        this.idExames = idExames;
    }
}