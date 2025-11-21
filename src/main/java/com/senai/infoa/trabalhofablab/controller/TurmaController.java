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

import com.senai.infoa.trabalhofablab.models.Turma;
import com.senai.infoa.trabalhofablab.service.TurmaService;



@RestController
@RequestMapping("/turma")
public class TurmaController {
    
     @Autowired
    private TurmaService turmaService;

   @PostMapping("/cadastrar")
    public Turma salvar(@RequestBody Turma turma) {
        return turmaService.salvar(turma);
    }

     @PutMapping("/atualizar/{id}")
    public Turma atualizar(@PathVariable Integer id, @RequestBody Turma turma) {
        return turmaService.atualizar(turma, id);
        
    }

    @GetMapping("/listar")
    public List<Turma> listarTodos() {
        return turmaService.listarTodos();
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

    @DeleteMapping("/delete/{id}")
    public String apagar(@PathVariable Integer id) {
        boolean deletou = turmaService.apagar(id);
        if (deletou) {
            return "Turma removido com sucesso";
        }
        return "Falha ao remover o turma";
    }
}
