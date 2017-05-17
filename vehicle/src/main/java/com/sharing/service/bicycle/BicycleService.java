package com.sharing.service.bicycle;

import com.sharing.domain.Bicycle;

import java.util.List;

/**
 * Created by aschroeder on 10.04.2017.
 */
public interface BicycleService {

    Bicycle create(Bicycle bicycle);

    Bicycle findById(long id);

    List<Bicycle> findAll();
}
