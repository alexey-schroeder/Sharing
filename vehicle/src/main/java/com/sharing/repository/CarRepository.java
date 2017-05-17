package com.sharing.repository;

import com.sharing.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by aschroeder on 10.04.2017.
 */

@Repository
public interface CarRepository extends  JpaRepository<Car, Long> {
}
