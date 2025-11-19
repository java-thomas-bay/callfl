package com.senai.infoa.trabalofablab.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.RequestBody;

import com.senai.infoa.agenisesi.models.Aula;
import com.senai.infoa.agenisesi.services.AulaService;


@RestController
@RequestMapping("/aula")
public class AulaController {
    
     @Autowired
    private AulaService aulaService;

    @PostMapping("/cadastro")
    public Aula salvar(@RequestBody Aula aula) {
        return aulaService.salvar(aula);
    }

    @GetMapping("/listar")
    public List<Aula> listarTodos() {
        return aulaService.listarTodos();
    }

   @DeleteMapping("/delete/{id}")
    public String apagar(@PathVariable Integer id) {
        boolean deletou = aulaService.apagar(id);
        if (deletou) {
            return "Aula removido com sucesso";
        }
        return "Falha ao remover o aula";
    }
    
     @GetMapping("/buscar/{id}")
    public String buscar(@PathVariable Integer id) {
        boolean buscou = aulaService.buscar(id);
        if (buscou) {
            String texto = "Aula " + id + "encontrado com sucesso";
            return texto;
        }
        return "Falha ao buscar o aula";
    }

    @PutMapping("/atualizar/{id}")
    public Aula atualizar(@PathVariable Integer id, @PathVariable Aula aula) {
        return aulaService.atualizar(aluno, id);
        
    }
}