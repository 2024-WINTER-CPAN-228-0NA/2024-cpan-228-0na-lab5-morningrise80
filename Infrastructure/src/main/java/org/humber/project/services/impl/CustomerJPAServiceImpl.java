package org.humber.project.services.impl;

import org.humber.project.domain.Customer;
import org.humber.project.entities.CustomerEntity;
import org.humber.project.repositories.CustomerJPARepository;
import org.humber.project.services.CustomerJPAService;
import org.humber.project.transformers.CustomerEntityTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.humber.project.transformers.CustomerEntityTransformer.transformToCustomer;
import static org.humber.project.transformers.CustomerEntityTransformer.transformToCustomerEntity;

@Service
public class CustomerJPAServiceImpl implements CustomerJPAService {
    private final CustomerJPARepository customerJPARepository;

    @Autowired
    public CustomerJPAServiceImpl(CustomerJPARepository customerJPARepository) {
        this.customerJPARepository = customerJPARepository;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        CustomerEntity customerEntity = transformToCustomerEntity(customer);
        CustomerEntity savedEntity = customerJPARepository.save(customerEntity);
        return transformToCustomer(savedEntity);
    }

    @Override
    public Customer getCustomerById(Long customerId){
        return customerJPARepository.findById(customerId)
                .map(CustomerEntityTransformer::transformToCustomer)
                .orElse(null);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return Optional.of(customerJPARepository.findAll())
                .map(CustomerEntityTransformer::transformToCustomers)
                .orElse(null);
    }
}
