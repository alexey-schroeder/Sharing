package com.sharing.vehicle.service.bicycle;

import com.sharing.vehicle.domain.Bicycle;

import java.util.List;

/**
 * Created by Alexey Schröder on 10.04.2017.
 */
public interface BicycleService {

    Bicycle create(Bicycle bicycle);

    Bicycle findById(long id);

    List<Bicycle> findAll();
}
