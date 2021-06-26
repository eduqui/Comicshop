package com.comicshop.repository;

import com.comicshop.model.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import com.comicshop.model.*;

@Repository
public interface  ClienteRepository extends JpaRepository<Cliente, Integer>{

    @Query(value = "SELECT o FROM Cliente o WHERE o.user=?1")
    Cliente findByUsuario(Usuario user);
}