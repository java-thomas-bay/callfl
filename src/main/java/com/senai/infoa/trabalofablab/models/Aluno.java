package com.senai.infoa.trabalofablab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected Integer id;
    
    @Column(name = "nome_completo")
    protected String nomeCompleto;

    @Column(name = "matricula")
    protected String matricula;

    @Column(name = "data_nascimento")
    protected String dataNascimento;

    @Column(name = "cpf")
    protected String cpf;


    @ManyToOne
    @JoinColumn(name = "turma_id")
    private Turma turma;


    public Usuario (){}


    public Usuario(Integer id, String nomeCompleto, String matricula, String dataNascimento, String cpf,
            Turma turma) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.turma = turma;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getNomeCompleto() {
        return nomeCompleto;
    }


    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }


    public String getMatricula() {
        return matricula;
    }


    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public String getDataNascimento() {
        return dataNascimento;
    }


    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public Endereco getTurma() {
        return turma;
    }


    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    
}