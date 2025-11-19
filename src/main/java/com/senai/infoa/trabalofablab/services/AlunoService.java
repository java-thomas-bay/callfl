package com.senai.infoa.trabalofablab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.agenisesi.models.Aluno;
import com.senai.infoa.agenisesi.repositories.AlunoRepository;

@Service
public class AlunoService {
    
    @Autowired  
    private AlunoRepository alunoRepository;

     public Aluno salvar(Aluno aluno){
        return alunoRepository.save(aluno);
    }

    public List<Aluno> listarTodos(){
        return alunoRepository.findAll();
    }

    public Aluno atualizar(Aluno aluno, Integer id){
    Aluno aluno2 = alunoRepository.findById(id).get();
    if(aluno2 != null){
        aluno.setId(id);
        return alunoRepositoryn.save(aluno);
    }
    return null;
    }

    public boolean buscar(Integer Id) {
        Aluno aluno = alunoRepository.findById(Id).get();
        if(aluno != null){
           alunoRepository.findById(Id);
            return true;
  
        }

        return false;

    }

     public boolean apagar(Integer Id) {
        Aluno aluno = alunoRepository.findById(Id).get();
        if(aluno != null){
            alunoRepository.deleteById(Id);
            return true;
  
        }

        return false;
}
}