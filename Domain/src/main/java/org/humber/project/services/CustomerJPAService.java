package org.humber.project.services;

import org.humber.project.domain.Customer;

import java.util.List;

public interface CustomerJPAService {
    Customer getCustomerById(Long customerId);

    List<Customer> getAllCustomers();

    Customer saveCustomer(Customer customer);
}
