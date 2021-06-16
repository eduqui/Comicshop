package com.comicshop.model;

import java.math.BigDecimal; 

import java.util.Date; 

import javax.persistence.Entity;               
import javax.persistence.Table;                
import javax.persistence.Id;                   
import javax.persistence.GeneratedValue;     
import javax.persistence.GenerationType;     
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.*;                               

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "t_product")
public class Producto{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String pais;
    private BigDecimal precio; 
    private String descripcion;
    @Temporal(TemporalType.DATE)  
    private Date dueDate; 
    private String imageFileName;
    private String status;
    
}
