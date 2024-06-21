package carmenromano.spring_data.repositories;

import carmenromano.spring_data.entities.Drink;
import carmenromano.spring_data.entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToppingRepositories  extends JpaRepository<Topping, Long> {
}
