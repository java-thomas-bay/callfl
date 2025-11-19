package com.senai.infoa.trabalofablab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.agenisesi.models.Turma;
import com.senai.infoa.agenisesi.repositories.TurmaRepository;

@Service
public class TurmaService {
    
    @Autowired  
    private TurmaRepository TurmaRepository;

     public Turma salvar(Turma Turma){
        return turmaRepository.save(turma);
    }

    public List<turma> listarTodos(){
        return turmaRepository.findAll();
    }

    public Turma atualizar(Turma turma, Integer id){
    Turma turma2 = turmaRepository.findById(id).get();
    if(turma2 != null){
        turma.setId(id);
        return turmaRepository.save(turma);
    }
    return null;
    }

    public boolean buscar(Integer Id) {
        Turma turma = turmaRepository.findById(Id).get();
        if(turma != null){
           turmaRepository.findById(Id);
            return true;
  
        }

        return false;

    }

     public boolean apagar(Integer Id) {
        Turma turma = turmaRepository.findById(Id).get();
        if(turma != null){
            turmaRepository.deleteById(Id);
            return true;
  
        }

        return false;
}
}