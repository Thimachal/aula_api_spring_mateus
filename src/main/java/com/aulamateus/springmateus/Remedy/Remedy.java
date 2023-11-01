package com.aulamateus.springmateus.Remedy;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Remedy")
//todas estas anotações abaixo são do loombok para evitar código grande
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Remedy {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Via via;
    private Integer lot;
    private Integer quantity;
    private String validate;
   @Enumerated(EnumType.STRING)
    private Laboratory laboratory;



}
