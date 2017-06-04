package com.sharing.vehicle.repository;

import com.sharing.vehicle.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Alexey Schröder on 10.04.2017.
 */

@Repository
public interface CarRepository extends  JpaRepository<Car, Long> {
}
