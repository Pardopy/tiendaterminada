package com.Tienda_V.service;

import com.Tienda_V.domain.Carrito;




public interface CarritoService {
    public Carrito getCarrito(Carrito carrito);
    public Carrito getCarritoCliente(long idCliente);
}
