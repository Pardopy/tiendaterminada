package com.Tienda_V.dao;

import com.Tienda_V.domain.Usuario;
import org.springframework.data.repository.CrudRepository;


public interface UsuarioDao extends CrudRepository<Usuario, Long> {
    Usuario findByUsername(String username);
}
