package com.senai.infoa.trabalofablab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.senai.infoa.pethan.models.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{
}