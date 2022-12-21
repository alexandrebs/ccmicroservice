package com.api.microservicecc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Propriedade {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private	String	nome;
    private	String	valor;
    private	String	descricao;
    private	String	categoria;

}
