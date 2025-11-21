package com.senai.infoa.trabalhofablab.repostitories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.senai.infoa.trabalhofablab.models.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{
     @Query(value="select * from admin where email = :email and senha = :senha", nativeQuery=true)
    public Admin findByAdmin(String email, String senha);
}
