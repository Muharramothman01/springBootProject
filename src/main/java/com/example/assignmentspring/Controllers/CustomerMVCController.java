package com.example.assignmentspring.Controllers;

import com.example.assignmentspring.Service.CustomerServicesInterface;
import com.example.assignmentspring.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerMVCController {
    //hello from ide
    @Autowired
    private CustomerServicesInterface customerServices;

    @GetMapping
    public String getAllCustomers(Model model){
        model.addAttribute("customers",customerServices.getAllCustomers());
        return "index";
    }

    @GetMapping("/add")
    public String addCustomers(Model model){
        model.addAttribute("customer",new Customer());
        return "add";
    }

    @PostMapping
    public String process(@ModelAttribute Customer customer){
        if(customer.getId() == 0){
            customerServices.createCustomer(customer);
        }else {
            customerServices.updateCustomer(customer);
        }
        return "redirect:/customers";
    }

    @RequestMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable int id){
        customerServices.deleteCustomer(customerServices.getCustomerById(id));
        return "redirect:/customers";
    }

    @RequestMapping("/update/{id}")
    public String updateCustomer(@PathVariable int id, Model model){
        model.addAttribute("customer",customerServices.getCustomerById(id));
        return "add";
    }


}
