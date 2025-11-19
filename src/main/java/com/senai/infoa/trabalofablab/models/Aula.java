package com.senai.infoa.trabalofablab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.LocalDate;

@Entity
@Table(name="aula")
public class Aula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected Integer id;

    @Column(name = "data")
    protected LocalDate data;

    @Column(name = "assunto")
    protected String assunto;

    @ManyToOne
    @JoinColumn(name = "turma_id")
    private Turma turma;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;


    public Aula (){}


    public Aula(Integer id, Localdate data, String assunto, Turma turma, Admin admin) {
        this.id = id;
        this.data = data;
        this.assunto = assunto;
        this.turma = turma;
        this.admin = admin;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getData() {
        return data;
    }


    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getAssunto() {
        return assunto;
    }


    public void setAsssunto(String assunto) {
        this.assunto = assunto;
    }


    public Endereco getTurma() {
        return turma;
    }


    public void setTurma(Turma turma) {
        this.turma = turma;
    }

     public Endereco getAdmin() {
        return admin;
    }


    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    
}