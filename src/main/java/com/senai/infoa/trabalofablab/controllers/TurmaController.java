package com.senai.infoa.trabalofablab.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.RequestBody;

import com.senai.infoa.agenisesi.models.Turma;
import com.senai.infoa.agenisesi.services.TurmaService;


@RestController
@RequestMapping("/turma")
public class TurmaController {
    
     @Autowired
    private TurmaService turmaService;

    @PostMapping("/cadastro")
    public Turma salvar(@RequestBody Turma turma) {
        return turmaService.salvar(turma);
    }

    @GetMapping("/listar")
    public List<Turma> listarTodos() {
        return turmaService.listarTodos();
    }

   @DeleteMapping("/delete/{id}")
    public String apagar(@PathVariable Integer id) {
        boolean deletou = turmaService.apagar(id);
        if (deletou) {
            return "Turma removido com sucesso";
        }
        return "Falha ao remover o turma";
    }
    
     @GetMapping("/buscar/{id}")
    public String buscar(@PathVariable Integer id) {
        boolean buscou = turmaService.buscar(id);
        if (buscou) {
            String texto = "Turma " + id + "encontrado com sucesso";
            return texto;
        }
        return "Falha ao buscar o turma";
    }

    @PutMapping("/atualizar/{id}")
    public Turma atualizar(@PathVariable Integer id, @PathVariable Turma turma) {
        return turmaService.atualizar(turma, id);
        
    }
}