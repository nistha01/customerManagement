package sunbase.customerManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sunbase.customerManagement.model.Customer;
import sunbase.customerManagement.repo.ICustomerRepo;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    ICustomerRepo customerRepo;

    public String addCustomer(Customer customer) {
        customerRepo.save(customer);
        return "customer created successfully";
    }

    public List<Customer> getAllCustomer() {
        return customerRepo.findAll();
    }

    public Customer getCustomerById(Long id) {
        return customerRepo.findById(id).orElse(null);
    }

    public String deleteCustomer(Long id) {
        Customer cust= customerRepo.findById(id).orElse(null);
        if(cust==null){
            return "No customer found by this id";
        }
        else{
            customerRepo.deleteById(id);
            return "customer details deleted";
        }
    }

    public String updateCustomer(Customer customer) {
        Long id=customer.getId();
        Customer cur=customerRepo.findById(id).orElse(null);
        if(cur!=null){
            cur.setCity(customer.getCity());
            cur.setAddress(customer.getAddress());
            cur.setEmail(customer.getEmail());
            cur.setPhone(customer.getPhone());
            cur.setState(customer.getState());
            cur.setStreet(customer.getStreet());
            cur.setFirst_name(customer.getFirst_name());
            cur.setLast_name(customer.getLast_name());
            customerRepo.save(cur);
            return "customer details updated";
        }
        else{
            return "Customer not found";
        }
    }
}
