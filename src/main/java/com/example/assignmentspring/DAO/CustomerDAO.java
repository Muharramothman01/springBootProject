package com.example.assignmentspring.DAO;

import com.example.assignmentspring.model.Customer;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAO {
    @Autowired
    private EntityManager entityManager;

    public Customer getCustomerById(int id){
        return entityManager.find(Customer.class,id);
    }

    public List<Customer> getAllCustomers(){
        return entityManager.createQuery("from Customer c", Customer.class).getResultList();
    }
    public void createCustomer(Customer customer){
        entityManager.persist(customer);
    }

    public void deleteCustomer(Customer customer){
        entityManager.remove(customer);
    }

    public void updateCustomer(Customer customer){
        entityManager.persist(customer);
    }


}
