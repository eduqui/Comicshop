package com.comicshop.comicshop.repository;

import com.comicshop.comicshop.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  UsuarioRepository extends JpaRepository<Usuario, String>{

    
}