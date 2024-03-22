package org.humber.project.transformers;

import org.humber.project.domain.Customer;
import org.humber.project.entities.CustomerEntity;

import java.util.List;
import java.util.stream.Collectors;

public final class CustomerEntityTransformer {

    public static CustomerEntity transformToCustomerEntity(Customer customer) {
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setCustomerId(customer.getCustomerId());
        customerEntity.setName(customer.getName());
        customerEntity.setCountry(customer.getCountry());
        customerEntity.setEmail(customer.getEmail());
        customerEntity.setPostalCode(customer.getPostalCode());
        customerEntity.setPhone(customer.getPhone());
        return customerEntity;
    }

    public static Customer transformToCustomer(CustomerEntity customerEntity){
        return Customer.builder()
                .customerId(customerEntity.getCustomerId())
                .name(customerEntity.getName())
                .country(customerEntity.getCountry())
                .email(customerEntity.getEmail())
                .postalCode(customerEntity.getPostalCode())
                .phone(customerEntity.getPhone())
                .build();

    }

    public static List<Customer> transformToCustomers(List<CustomerEntity> entities) {
        return entities.stream()
                .map(CustomerEntityTransformer::transformToCustomer)
                .collect(Collectors.toList());
    }
}
