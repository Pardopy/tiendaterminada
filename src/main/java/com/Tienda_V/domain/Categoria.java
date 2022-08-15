package com.Tienda_V.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="Categoria")
public class Categoria implements Serializable {
     private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
    @Column(name="id_categoria")
    private Long idCategoria; //Hibernate lo tranforma en id_credito
    private String descripcion;
    private boolean activo;
    

    public Categoria() {
    }

    public Categoria(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }

    
    
    
}
