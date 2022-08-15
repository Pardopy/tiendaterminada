package com.Tienda_V.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="Credito")
public class Credito implements Serializable {
     private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
    @Column(name="id_credito")
    private Long idCredito; //Hibernate lo tranforma en id_credito
    public double limite;

    public Credito() {
    }

    public Credito(double limite) {
        this.limite = limite;
    }
    
    
}
