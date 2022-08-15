
package com.Tienda_V.dao;

import com.Tienda_V.domain.Carrito;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;


public interface CarritoDao extends CrudRepository<Carrito, Long>  {
    Optional<Carrito> findByIdCliente(Long idCliente);
}