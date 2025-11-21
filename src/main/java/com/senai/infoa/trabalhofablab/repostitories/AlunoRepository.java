package com.senai.infoa.trabalhofablab.repostitories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.infoa.trabalhofablab.models.Aluno;



@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer>{
    
}
    

