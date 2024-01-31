package sunbase.customerManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import sunbase.customerManagement.model.Customer;
import sunbase.customerManagement.service.CustomerService;

import java.util.List;

@RestController
@Validated
public class CustomerController {
    @Autowired
    CustomerService customerService;
   // Create a customer-
    @PostMapping("customer")
    public String createCustomer(@RequestBody Customer customer){
       return customerService.addCustomer(customer);

    }
    // Get a list of customer (API with pagination sorting and searching )-
    @GetMapping("customer")
    public List<Customer> getAllCustomer(){
        return customerService.getAllCustomer();
    }

    //Update a customer-
    @PutMapping("update/customer")
    public String updateCustomer(@RequestBody Customer customer){
        return customerService.updateCustomer(customer);
    }

    // Get a single customer based on ID-
    @GetMapping("customer/id/{id}")
    public Customer getCustomerById(@PathVariable Long id){
        return customerService.getCustomerById(id);
    }
   // Delete a customer

    @DeleteMapping("customer/id/{id}")
    public String deleteById(@PathVariable Long id){
        return customerService.deleteCustomer(id);
    }
}
