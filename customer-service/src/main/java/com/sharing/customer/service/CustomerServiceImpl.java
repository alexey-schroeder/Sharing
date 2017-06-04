package com.sharing.customer.service;

import com.sharing.customer.domain.Customer;
import com.sharing.customer.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Alexey Schröder on 10.04.2017.
 */

@Service
public class CustomerServiceImpl implements CustomerService {

    @Inject
    private CustomerRepository customerRepository;

    @Override
    public Customer create(Customer bicycle) {
        return customerRepository.save(bicycle);
    }

    @Override
    public Customer findById(long id) {
        return customerRepository.findOne(id);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
