package com.sharing.vehicle.domain;

import javax.persistence.Entity;

/**
 * Created by Alexey Schröder on 05.04.2017.
 */

@Entity
public class Bicycle extends Vehicle {

    public Bicycle() {
        wheelNumber = 2;
    }
}
