package com.sharing.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by aschroeder on 05.04.2017.
 */
@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public abstract class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected long id;

    protected String model;
    protected int wheelNumber;
    protected Date manufactureYear;

    @ManyToOne
    protected EngineType engineType;

    @ManyToOne
    protected Producer producer;
}
