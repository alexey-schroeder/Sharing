package com.sharing.vehicle.controller;

import com.sharing.vehicle.domain.Car;
import com.sharing.vehicle.service.car.CarService;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by Alexey Schröder on 10.04.2017.
 */

@RestController
@RequestMapping("cars")
public class CarController {

    @Inject
    private CarService carService;

    @RequestMapping(path = "{id}", method = RequestMethod.GET)
    public Car findCarById(@PathVariable long id){
        return carService.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Car> getAllCars(){
        return carService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Car create(@Valid @RequestBody Car car)  {
        return carService.create(car);
    }
}
