package repository;

import model.Customers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomersRepository extends CrudRepository<Customers,Long> {

    Optional<Customers> findById(Long Id);
    Optional<Customers>findByLastName(String lastName);
    List<Customers> findAll();
    Optional<Customers>findByUsername(String username);

}
