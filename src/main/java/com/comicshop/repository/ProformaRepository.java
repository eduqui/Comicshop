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

public class ProformaRepository {
    
    @Query(value = "SELECT o FROM Proforma o WHERE o.user=?1")
    public
    List<Proforma> findItemsByUsuario(Usuario user);

    @Query(value = "SELECT o FROM Proforma o WHERE o.user=?1 And o.product=?2")
    Optional<Proforma> findProformaByUsuarioAndProducto(Usuario user, Producto product);
}
