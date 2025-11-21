package com.senai.infoa.trabalhofablab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.trabalhofablab.models.Admin;
import com.senai.infoa.trabalhofablab.repostitories.AdminRepository;


@Service
public class AdminService {
    
    @Autowired 
    private AdminRepository adminRepository;



    public Admin salvar(Admin admin){
        return adminRepository.save(admin);
    }

    public Admin login(String email, String senha){
        Admin admin = adminRepository.findByAdmin(email, senha);
        if(admin != null && senha.equals(admin.getSenha())){
            return admin;
        }
        return null;
    }

    public List<Admin> listarTodos(){
        return adminRepository.findAll();
    }

      public boolean buscar(Integer id) {
        Admin admin = adminRepository.findById(id).get();
        if(admin != null){
           adminRepository.findById(id);
            return true;
  
        }

        return false;
    }

    public Admin atualizar(Admin admin, Integer id){
    Admin admin2 = adminRepository.findById(id).get();
    if(admin2 != null){
        admin.setId(id);
        return adminRepository.save(admin);
    }
    return null;
}

 public boolean apagar(Integer id) {
        Admin admin = adminRepository.findById(id).get();
        if(admin != null){
            adminRepository.deleteById(id);
            return true;
  
        }

        return false;
}
}
