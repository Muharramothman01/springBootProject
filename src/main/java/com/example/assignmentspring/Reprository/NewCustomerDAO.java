package com.example.assignmentspring.Reprository;

import com.example.assignmentspring.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NewCustomerDAO extends JpaRepository<Customer, Integer> {
     Customer findByFirstName(String fName);
     @Query("FROM Customer c WHERE c.firstName LIKE ?1")
     List<Customer> findCustomersLikeName(String name);
}
