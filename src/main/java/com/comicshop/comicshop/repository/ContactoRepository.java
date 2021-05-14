package com.comicshop.comicshop.repository;

import com.comicshop.comicshop.model.Contacto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  ContactoRepository extends JpaRepository<Contacto, Integer>{

    
}