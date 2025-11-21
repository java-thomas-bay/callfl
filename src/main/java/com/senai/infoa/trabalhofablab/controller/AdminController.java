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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infoa.trabalhofablab.models.Admin;
import com.senai.infoa.trabalhofablab.service.AdminService;


@RestController
@RequestMapping("/admin")
public class AdminController {
    
     @Autowired
    private AdminService adminService;

   @PostMapping("/cadastrar")
    public Admin salvar(@RequestBody Admin admin) {
        return adminService.salvar(admin);
    }

   @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String senha) {
        return adminService.login(email, senha);
    }

     @PutMapping("/atualizar/{id}")
    public Admin atualizar(@PathVariable Integer id, @RequestBody Admin admin) {
        return adminService.atualizar(admin, id);
        
    }

    @GetMapping("/listar")
    public List<Admin> listarTodos() {
        return adminService.listarTodos();
    }

     @GetMapping("/buscar/{id}")
    public String buscar(@PathVariable Integer id) {
        boolean buscou = adminService.buscar(id);
        if (buscou) {
            String texto = "Admin " + id + "encontrado com sucesso";
            return texto;
        }
        return "Falha ao buscar o admin";
    }

    @DeleteMapping("/delete/{id}")
    public String apagar(@PathVariable Integer id) {
        boolean deletou = adminService.apagar(id);
        if (deletou) {
            return "Admin removido com sucesso";
        }
        return "Falha ao remover o admin";
    }
}
