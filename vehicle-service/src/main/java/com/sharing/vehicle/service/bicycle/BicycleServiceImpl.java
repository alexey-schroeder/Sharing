package com.sharing.vehicle.service.bicycle;

import com.sharing.vehicle.domain.Bicycle;
import com.sharing.vehicle.repository.BicycleRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Alexey Schröder on 10.04.2017.
 */

@Service
public class BicycleServiceImpl implements BicycleService {

    @Inject
    private BicycleRepository bicycleRepository;

    @Override
    public Bicycle create(Bicycle bicycle) {
        return bicycleRepository.save(bicycle);
    }

    @Override
    public Bicycle findById(long id) {
        return bicycleRepository.findOne(id);
    }

    @Override
    public List<Bicycle> findAll() {
        return bicycleRepository.findAll();
    }
}
