
package com.Tienda_V.service;

import com.Tienda_V.dao.ClienteDao;
import com.Tienda_V.dao.CreditoDao;
import com.Tienda_V.domain.Cliente;
import com.Tienda_V.domain.Credito;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteDao clienteDao;
    
    @Autowired
    private CreditoDao creditoDao;


    @Override
    @Transactional(readOnly = true)
    public List<Cliente> getClientes() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente getCliente(Cliente cliente) {
        return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    
    }

    
    @Override
    @Transactional
    public void save(Cliente cliente) { //idCliente = 0 ..... credito { idCredito = 0, limite = 5000 }
        Credito credito = cliente.getCredito();
        credito = creditoDao.save(credito);//credito { idCredito = 5, limite = 5000 };
        cliente.setCredito(credito);
        clienteDao.save(cliente);
    }
    
    @Override
    @Transactional
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);
    }

}
