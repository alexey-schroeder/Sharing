package com.sharing.customer.service;

import com.sharing.customer.domain.Customer;

import java.util.List;

/**
 * Created by Alexey Schröder (mail@alexey-schroder.de) on 04.06.2017.
 */
public interface CustomerService {
    Customer create(Customer customer);
    List<Customer> findAll();
    Customer findById(long id);
}
