package com.sharing.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by aschroeder on 05.04.2017.
 */

@Entity
@Data
public class Engine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    enum Type {
        BENZIN, DISEL, ELECTRO
    }

    @Enumerated(EnumType.STRING)
    Type type;

    private int horsepower;
}
