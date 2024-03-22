package org.humber.project.controllers;

import org.humber.project.domain.Customer;
import org.humber.project.services.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping
    public List<Customer> getAllCustomers(){return customerService.getAllCustomers();}

    @PostMapping
    public void addCustomer(@RequestBody Customer customer){customerService.createCustomer(customer);}



}
