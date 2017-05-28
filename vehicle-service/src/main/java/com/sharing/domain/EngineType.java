package com.sharing.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by aschroeder on 05.04.2017.
 */

@Entity
@Data
public class EngineType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    enum Type {
        GAS, DIESEL, ELECTRO
    }

    @Enumerated(EnumType.STRING)
    Type type;

    private int horsepower;
}
