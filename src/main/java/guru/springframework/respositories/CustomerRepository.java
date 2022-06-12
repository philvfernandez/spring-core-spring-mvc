package guru.springframework.respositories;

import guru.springframework.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
