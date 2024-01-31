package sunbase.customerManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sunbase.customerManagement.model.Customer;

@Repository
public interface ICustomerRepo extends JpaRepository<Customer,Long> {
}
