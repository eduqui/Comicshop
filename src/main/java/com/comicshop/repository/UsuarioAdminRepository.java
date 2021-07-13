package com.comicshop.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.comicshop.model.UsuarioAdmin;

public interface UsuarioAdminRepository extends JpaRepository<UsuarioAdmin,String>{
    
}
