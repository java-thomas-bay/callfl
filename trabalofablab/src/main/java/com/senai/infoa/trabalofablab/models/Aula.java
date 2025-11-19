package com.senai.infoa.trabalofablab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.localdate;

@Entity
@Table(name="aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected Integer id;

    @Column(name = "data")
    protected Localdate data;

    @ManyToOne
    @JoinColumn(name = "turma_id")
    private Turma turma;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;


    public Usuario (){}


    public Usuario(Integer id, Localdate data, Turma turma, Admin admin) {
        this.id = id;
        this.data = data;
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


    public void setData(Localdate data) {
        this.data = data;
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