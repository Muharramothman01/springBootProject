package com.example.assignmentspring.Service;

import com.example.assignmentspring.model.Customer;

import java.util.List;

public interface CustomerServicesInterface {
    Customer getCustomerById(int id);
    Customer getCustomerByFirstName(String fName);
    List<Customer> getAllCustomers();
    void createCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer(Customer customer);

}
