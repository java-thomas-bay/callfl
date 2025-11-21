package com.senai.infoa.trabalhofablab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.trabalhofablab.models.Aula;
import com.senai.infoa.trabalhofablab.repostitories.AulaRepository;

@Service
public class AulaService {
    
    @Autowired
    private AulaRepository aulaRepository;

    public Aula salvar(Aula aula){
        return aulaRepository.save(aula);
    }

    public List<Aula> listarTodos(){
        return aulaRepository.findAll();
    }

      public boolean buscar(Integer id) {
        Aula aula = aulaRepository.findById(id).get();
        if(aula != null){
           aulaRepository.findById(id);
            return true;
  
        }

        return false;
    }

    public Aula atualizar(Aula aula, Integer id){
    Aula aula2 = aulaRepository.findById(id).get();
    if(aula2 != null){
        aula.setId(id);
        return aulaRepository.save(aula);
    }
    return null;
}

 public boolean apagar(Integer id) {
        Aula aula = aulaRepository.findById(id).get();
        if(aula != null){
            aulaRepository.deleteById(id);
            return true;
  
        }

        return false;
}

}
