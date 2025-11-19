package com.senai.infoa.trabalofablab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.senai.infoa.pethan.models.Turma;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Integer>{
}