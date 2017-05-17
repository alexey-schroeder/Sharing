package com.sharing.controller;

import com.sharing.domain.Car;
import com.sharing.service.car.CarService;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by aschroeder on 10.04.2017.
 */

@RestController
public class CarController {

    @Inject
    private CarService carService;

    @RequestMapping(path = "car/{id}", method = RequestMethod.GET)
    public Car findCarById(@PathVariable long id){
        return carService.findById(id);
    }

    @RequestMapping(path = "cars", method = RequestMethod.GET)
    public List<Car> getAllCars(){
        return carService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Car create(@Valid @RequestBody Car car)  {
        return carService.create(car);
    }
}
