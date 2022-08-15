package com.Tienda_V.service;

import com.Tienda_V.domain.Articulo;
import com.Tienda_V.domain.CarritoDetalle;
import java.util.List;

public interface CarritoDetalleService {
   
    
    CarritoDetalle getCarritoDetalle(Long idCarrito, Articulo articulo);
    
    
    public List<CarritoDetalle> getCarritoDetalles(Long idCarrito);
    
    
    public void save(CarritoDetalle carritoDetalle);
   
    
    public void delete(CarritoDetalle carritoDetalle);
   
    
    public void deleteAll(Long idCarrito);
}