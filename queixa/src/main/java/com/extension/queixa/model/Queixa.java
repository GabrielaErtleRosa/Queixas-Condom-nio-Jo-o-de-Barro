package com.extension.queixa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "queixa")
public class Queixa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String morador;

    private String bloco;
    private String predio;
    private String apartamento;

    @NotNull
    private String reclamacao;

    @NotNull
    private Integer prioridade;

    // Construtor padrão
    public Queixa() {
    }

    // Construtor com parâmetros
    public Queixa(String morador, String bloco, String predio, String apartamento, String reclamacao, Integer prioridade) {
        this.morador = morador;
        this.bloco = bloco;
        this.predio = predio;
        this.apartamento = apartamento;
        this.reclamacao = reclamacao;
        setPrioridade(prioridade); // Utiliza o setter para validação
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMorador() {
        return morador;
    }

    public void setMorador(String morador) {
        this.morador = morador;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public String getPredio() {
        return predio;
    }

    public void setPredio(String predio) {
        this.predio = predio;
    }

    public String getApartamento() {
        return apartamento;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }

    public String getReclamacao() {
        return reclamacao;
    }

    public void setReclamacao(String reclamacao) {
        this.reclamacao = reclamacao;
    }

    public Integer getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Integer prioridade) {
        if (prioridade >= 1 && prioridade <= 5) {
            this.prioridade = prioridade;
        } else {
            throw new IllegalArgumentException("A prioridade deve estar entre 1 e 5.");
        }
    }

    @Override
    public String toString() {
        return "Queixa{" +
                "id=" + id +
                ", morador='" + morador + '\'' +
                ", bloco='" + bloco + '\'' +
                ", predio='" + predio + '\'' +
                ", apartamento='" + apartamento + '\'' +
                ", reclamacao='" + reclamacao + '\'' +
                ", prioridade=" + prioridade +
                '}';
    }
}




