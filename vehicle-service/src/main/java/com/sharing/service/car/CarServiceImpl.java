package com.sharing.service.car;

import com.sharing.domain.Car;
import com.sharing.repository.CarRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by aschroeder on 10.04.2017.
 */
@Service
public class CarServiceImpl implements CarService {

    @Inject
    private CarRepository carRepository;

    @Override
    public Car create(Car car) {
        return carRepository.save(car);
    }

    @Override
    public Car findById(long id) {
        return carRepository.findOne(id);
    }

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }
}
