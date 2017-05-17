package com.sharing.repository;

import com.sharing.domain.Bicycle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by aschroeder on 10.04.2017.
 */
@Repository
public interface BicycleRepository extends JpaRepository<Bicycle, Long> {
}
