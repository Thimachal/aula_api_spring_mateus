package com.aulamateus.springmateus.Remedy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Remedy {
    @Id

    private Long id;
    private String name;
    private Via via;
    private Integer lot;
    private Integer quantity;
    private String validate;
    private Laboratory laboratory;



}
