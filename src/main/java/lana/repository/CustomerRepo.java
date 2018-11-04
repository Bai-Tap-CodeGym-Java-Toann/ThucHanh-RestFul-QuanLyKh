package lana.repository;

import lana.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepo extends CrudRepository<Customer,Long> {
    List<Customer> findAll();
}
