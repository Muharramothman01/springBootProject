package com.example.assignmentspring.Controllers;

import com.example.assignmentspring.Reprository.NewCustomerDAO;
import com.example.assignmentspring.Service.CustomerServicesInterface;
import com.example.assignmentspring.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers2")
public class CustomerRestController2 {
    @Autowired
    private CustomerServicesInterface customerServicesClass;

    @Autowired
    private NewCustomerDAO customerDAO;

    @GetMapping
    public List<Customer> getAllCustomers(){
        return customerServicesClass.getAllCustomers();
    }
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable int id){
        return customerServicesClass.getCustomerById(id);
    }
    @PostMapping
    public String createCustomer(@RequestBody Customer customer){
        System.out.println(customer);
        customerServicesClass.createCustomer(customer);
        return "inserted successfully in data base";
    }

    @PutMapping
    public String updateCustomer(@RequestBody Customer customer){
        customerServicesClass.updateCustomer(customer);
        return "updated successfully in database";
    }

    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable int id){
        customerServicesClass.deleteCustomer(customerServicesClass.getCustomerById(id));
        return "deleted successfully from database";
    }

    @GetMapping("/name/{fName}")
    public Customer getCustomerByName(@PathVariable("fName") String fName){
        return customerServicesClass.getCustomerByFirstName(fName);
    }

    @GetMapping("/name/like/{name}")
    public List<Customer> getCustomersLikeName(@PathVariable String name){
        return customerDAO.findCustomersLikeName(name);
    }

}
