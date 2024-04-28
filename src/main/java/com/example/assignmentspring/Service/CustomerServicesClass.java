package com.example.assignmentspring.Service;

import com.example.assignmentspring.Reprository.NewCustomerDAO;
import com.example.assignmentspring.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServicesClass implements CustomerServicesInterface{

    @Autowired
    private NewCustomerDAO newCustomerDAO;
    @Override
    public Customer getCustomerById(int id) {
        Optional<Customer> result = newCustomerDAO.findById(id);
        return result.orElse(null);
    }

    @Override
    public Customer getCustomerByFirstName(String fName) {
        return newCustomerDAO.findByFirstName(fName);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return newCustomerDAO.findAll();
    }

    @Override
    public void createCustomer(Customer customer) {
        newCustomerDAO.save(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        newCustomerDAO.save(customer);
    }

    @Override
    public void deleteCustomer(Customer customer) {
        newCustomerDAO.delete(customer);
    }


}
