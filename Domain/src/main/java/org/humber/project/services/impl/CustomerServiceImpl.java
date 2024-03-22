package org.humber.project.services.impl;

import org.humber.project.domain.Customer;
import org.humber.project.services.CustomerJPAService;
import org.humber.project.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public class CustomerServiceImpl implements CustomerService {
    private final CustomerJPAService customerJPAService;

    @Autowired
    public CustomerServiceImpl(CustomerJPAService customerJPAService) {
        this.customerJPAService = customerJPAService;
    }

    @Override
    public List<Customer> getAllCustomers() {
        System.out.println("Retrieving all customers");
        return customerJPAService.getAllCustomers();
    }

    @Override
    public void createCustomer(Customer customer) {
        customerJPAService.saveCustomer(customer);
        System.out.println("Saved Record: " + customer);
    }


}
