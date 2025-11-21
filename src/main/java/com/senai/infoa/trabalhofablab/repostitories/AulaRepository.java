package com.senai.infoa.trabalhofablab.repostitories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.infoa.trabalhofablab.models.Aula;

@Repository
public interface AulaRepository extends JpaRepository<Aula, Integer> {
    
}
