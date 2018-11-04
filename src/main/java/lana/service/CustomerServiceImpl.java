package lana.service;

import lana.model.Customer;
import lana.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepo customerRepo;

    @Override
    public List<Customer> listAll() {
        return customerRepo.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRepo.findOne(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepo.save(customer);

    }

    @Override
    public void remove(Customer customer) {
        customerRepo.delete(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepo.delete(id);
    }

}
