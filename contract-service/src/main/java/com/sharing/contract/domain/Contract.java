package com.sharing.contract.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Alexey Schröder (mail@alexey-schroder.de) on 04.06.2017.
 */

@Data
@Entity
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long customerId;
    private long vehicleId;
}
