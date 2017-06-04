package com.sharing.customer.controller;

import com.sharing.customer.domain.Customer;
import com.sharing.customer.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by Alexey Schröder on 10.04.2017.
 */

@RestController
@RequestMapping("customers")
public class CustomerController {

    @Inject
    private CustomerService customerService;

    @RequestMapping(path = "{id}", method = RequestMethod.GET)
    public Customer findCustomerById(@PathVariable long id){
        return customerService.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Customer> getAllCustomers(){
        return customerService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Customer create(@Valid @RequestBody Customer customer)  {
        return customerService.create(customer);
    }
}
