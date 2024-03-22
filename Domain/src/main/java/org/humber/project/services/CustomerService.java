package org.humber.project.services;

import org.humber.project.domain.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();
    void createCustomer(Customer customer);

}
