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

import com.senai.infoa.trabalhofablab.models.Aluno;
import com.senai.infoa.trabalhofablab.service.AlunoService;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
     
    
     @Autowired
    private AlunoService alunoService;

   @PostMapping("/cadastrar")
    public Aluno salvar(@RequestBody Aluno aluno) {
        return alunoService.salvar(aluno);
    }

     @PutMapping("/atualizar/{id}")
    public Aluno atualizar(@PathVariable Integer id, @RequestBody Aluno aluno) {
        return alunoService.atualizar(aluno, id);
        
    }

    @GetMapping("/listar")
    public List<Aluno> listarTodos() {
        return alunoService.listarTodos();
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

    @DeleteMapping("/delete/{id}")
    public String apagar(@PathVariable Integer id) {
        boolean deletou = alunoService.apagar(id);
        if (deletou) {
            return "Aluno removido com sucesso";
        }
        return "Falha ao remover o aluno";
    }
}
