package com.comicshop.repository;

import java.util.List;
import java.util.Optional;

import com.comicshop.model.Producto;
import com.comicshop.model.Proforma;
import com.comicshop.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository

public interface ProformaRepository extends JpaRepository<Proforma, Integer>{
    
    

}