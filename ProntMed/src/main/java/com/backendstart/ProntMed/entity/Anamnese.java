package com.backendstart.ProntMed.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="anamnese")
public class Anamnese {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAnamnese;

    @Column(nullable = false, name = "tratamentos_esteticos")
    private boolean tratamentosEsteticos;

    @Column(nullable = false, name = "exercicios_fisicos")
    private boolean exerciciosFisicos;

    @Column(nullable = false, name = "alimentacao_balanceada")
        private boolean alimentacaoBalanceada;

    @Column(nullable = false, name = "antecendente_alergicos")
    private boolean antecendenteAalergicos;

    @Column(nullable = false, name = "ingere_alcool")
    private boolean ingereAlcool;

    @Column(nullable = false, name = "tabagista")
    private boolean tabagista;

    @Column(nullable = false, name = "problemas_cardiacos")
    private boolean problemasCardiacos;

    @Column(nullable = false, name = "problemas_ortopedicos")
    private boolean problemasOrtopedicos;


   //getters and setters


    public Long getId() {
        return idAnamnese;
    }

    public void setId(Long id) {
        this.idAnamnese = idAnamnese;
    }

    public boolean isTratamentosEsteticos() {
        return tratamentosEsteticos;
    }

    public void setTratamentosEsteticos(boolean tratamentosEsteticos) {
        this.tratamentosEsteticos = tratamentosEsteticos;
    }

    public boolean isExerciciosFisicos() {
        return exerciciosFisicos;
    }

    public void setExerciciosFisicos(boolean exerciciosFisicos) {
        this.exerciciosFisicos = exerciciosFisicos;
    }

    public boolean isAlimentacaoBalanceada() {
        return alimentacaoBalanceada;
    }

    public void setAlimentacaoBalanceada(boolean alimentacaoBalanceada) {
        this.alimentacaoBalanceada = alimentacaoBalanceada;
    }

    public boolean isAntecendenteAalergicos() {
        return antecendenteAalergicos;
    }

    public void setAntecendenteAalergicos(boolean antecendenteAalergicos) {
        this.antecendenteAalergicos = antecendenteAalergicos;
    }

    public boolean isIngereAlcool() {
        return ingereAlcool;
    }

    public void setIngereAlcool(boolean ingereAlcool) {
        this.ingereAlcool = ingereAlcool;
    }

    public boolean isTabagista() {
        return tabagista;
    }

    public void setTabagista(boolean tabagista) {
        this.tabagista = tabagista;
    }

    public boolean isProblemasCardiacos() {
        return problemasCardiacos;
    }

    public void setProblemasCardiacos(boolean problemasCardiacos) {
        this.problemasCardiacos = problemasCardiacos;
    }

    public boolean isProblemasOrtopedicos() {
        return problemasOrtopedicos;
    }

    public void setProblemasOrtopedicos(boolean problemasOrtopedicos) {
        this.problemasOrtopedicos = problemasOrtopedicos;
    }
}

//enfermeiro prontuario anamnese