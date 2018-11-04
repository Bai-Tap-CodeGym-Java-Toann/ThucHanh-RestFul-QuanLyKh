package lana.service;

import lana.model.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> listAll();
    public Customer findById(Long id);
    public void save(Customer customer);
    public void remove(Customer customer);
    public void remove(Long id);
}
