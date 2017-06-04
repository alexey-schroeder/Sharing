package com.sharing.vehicle.service.car;

import com.sharing.vehicle.domain.Car;

import java.util.List;

/**
 * Created by Alexey Schröder on 10.04.2017.
 */
public interface CarService {

    Car create(Car car);

    Car findById(long id);

    List<Car> findAll();
}
