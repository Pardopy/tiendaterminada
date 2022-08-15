
package com.Tienda_V.dao;

import com.Tienda_V.domain.Cliente;
import org.springframework.data.repository.CrudRepository;


public interface ClienteDao extends CrudRepository<Cliente, Long>{
    
}
