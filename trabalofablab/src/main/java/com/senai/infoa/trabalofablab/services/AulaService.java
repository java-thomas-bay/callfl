package com.senai.infoa.trabalofablab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.agenisesi.models.Aula;
import com.senai.infoa.agenisesi.repositories.AulaRepository;

@Service
public class AulaService {
    
    @Autowired  
    private AulaRepository aulaRepository;

     public Aula salvar(Aula aula){
        return aulaRepository.save(aula);
    }

    public List<aula> listarTodos(){
        return aulaRepository.findAll();
    }

    public Aula atualizar(Aula aula, Integer id){
    Aula aula2 = aulaRepository.findById(id).get();
    if(aula2 != null){
        aula.setId(id);
        return aulaRepository.save(aula);
    }
    return null;
    }

    public boolean buscar(Integer Id) {
        Aula aula = aulaRepository.findById(Id).get();
        if(aula != null){
           aulaRepository.findById(Id);
            return true;
  
        }

        return false;

    }

     public boolean apagar(Integer Id) {
        Aula aula = aulaRepository.findById(Id).get();
        if(aula != null){
            aulaRepository.deleteById(Id);
            return true;
  
        }

        return false;
}
}