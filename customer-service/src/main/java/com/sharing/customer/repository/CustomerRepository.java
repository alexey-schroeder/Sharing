package com.sharing.customer.repository;

import com.sharing.customer.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Alexey Schröder (mail@alexey-schroder.de) on 04.06.2017.
 */

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
