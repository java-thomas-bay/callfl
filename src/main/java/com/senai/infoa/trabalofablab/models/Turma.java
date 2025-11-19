package com.senai.infoa.trabalofablab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="turma")
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected Integer id;

    @Column(name = "nome_professor")
    protected String nomeProfessor;

    @Column(name = "numero")
    protected String numero;


    public Turma (){}


    public Turma(Integer id, String nomeProfessor, String numero) {
        this.id = id;
        this.nomeProfessor = nomeProfessor;
        this.numero = numero;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getNomeProfessor() {
        return nomeProfessor;
    }


    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }


    public String getNumero() {
        return numero;
    }


    public void setNumero(String numero) {
        this.numero = numero;
    }

    
}