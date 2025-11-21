package com.senai.infoa.trabalhofablab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infoa.trabalhofablab.models.Aula;
import com.senai.infoa.trabalhofablab.service.AulaService;



@RestController
@RequestMapping("/aula")
public class AulaController {
    
     @Autowired
    private AulaService aulaService;

   @PostMapping("/cadastrar")
    public Aula salvar(@RequestBody Aula aula) {
        return aulaService.salvar(aula);
    }

     @PutMapping("/atualizar/{id}")
    public Aula atualizar(@PathVariable Integer id, @RequestBody Aula aula) {
        return aulaService.atualizar(aula, id);
        
    }

    @GetMapping("/listar")
    public List<Aula> listarTodos() {
        return aulaService.listarTodos();
    }

     @GetMapping("/buscar/{id}")
    public String buscar(@PathVariable Integer id) {
        boolean buscou = aulaService.buscar(id);
        if (buscou) {
            String texto = "Aula " + id + "encontrado com sucesso";
            return texto;
        }
        return "Falha ao buscar a aula";
    }

    @DeleteMapping("/delete/{id}")
    public String apagar(@PathVariable Integer id) {
        boolean deletou = aulaService.apagar(id);
        if (deletou) {
            return "Aula removido com sucesso";
        }
        return "Falha ao remover a aula";
    }
}
