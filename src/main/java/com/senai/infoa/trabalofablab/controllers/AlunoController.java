package com.senai.infoa.trabalofablab.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.RequestBody;

import com.senai.infoa.agenisesi.models.Aluno;
import com.senai.infoa.agenisesi.services.AlunoService;


@RestController
@RequestMapping("/aluno")
public class AlunoController {
    
     @Autowired
    private AlunoService alunoService;

    @PostMapping("/cadastro")
    public Aluno salvar(@RequestBody Aluno aluno) {
        return alunoService.salvar(aluno);
    }

    @GetMapping("/listar")
    public List<Aluno> listarTodos() {
        return alunoService.listarTodos();
    }

   @DeleteMapping("/delete/{id}")
    public String apagar(@PathVariable Integer id) {
        boolean deletou = alunoService.apagar(id);
        if (deletou) {
            return "Aluno removido com sucesso";
        }
        return "Falha ao remover o aluno";
    }
    
     @GetMapping("/buscar/{id}")
    public String buscar(@PathVariable Integer id) {
        boolean buscou = alunoService.buscar(id);
        if (buscou) {
            String texto = "Aluno " + id + "encontrado com sucesso";
            return texto;
        }
        return "Falha ao buscar o aluno";
    }

    @PutMapping("/atualizar/{id}")
    public Aluno atualizar(@PathVariable Integer id, @PathVariable Aluno aluno) {
        return alunoService.atualizar(aluno, id);
        
    }
}