package com.comicshop.comicshop.repository;

import com.comicshop.comicshop.model.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  ClienteRepository extends JpaRepository<Cliente, Integer>{

    
}