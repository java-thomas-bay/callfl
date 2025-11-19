package com.senai.infoa.trabalofablab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.agenisesi.models.Admin;
import com.senai.infoa.agenisesi.repositories.AdminRepository;

@Service
public class AdminService {
    
    @Autowired  
    private AdminRepository adminRepository;

     public Admin salvar(Admin admin){
        return adminRepository.save(admin);
    }

    public List<Admin> listarTodos(){
        return adminRepository.findAll();
    }

    public String login(String cpf, String senha){
        Admin admin = adminRepository.findById(id);
        if(admin != null && admin.equals(admin.getSenha())){
            return "Login efetuado com sucesso!";
        }
        return "Falha ao realizar login";
    }

    public Admin atualizar(Admin admin, Integer id){
    Admin admin2 = adminRepository.findById(id).get();
    if(admin2 != null){
        admin.setId(id);
        return adminRepository.save(admin);
    }
    return null;
    }

    public boolean buscar(Integer Id) {
        Admin admin = adminRepository.findById(Id).get();
        if(admin != null){
           adminRepository.findById(Id);
            return true;
  
        }

        return false;

    }

     public boolean apagar(Integer Id) {
        Admin admin = adminRepository.findById(Id).get();
        if(admin != null){
            adminRepository.deleteById(Id);
            return true;
  
        }

        return false;
}


}