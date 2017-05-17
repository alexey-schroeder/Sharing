package com.sharing.service.car;

import com.sharing.domain.Car;

import java.util.List;

/**
 * Created by aschroeder on 10.04.2017.
 */
public interface CarService {

    Car create(Car car);

    Car findById(long id);

    List<Car> findAll();
}
