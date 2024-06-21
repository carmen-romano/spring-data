package carmenromano.spring_data.repositories;

import carmenromano.spring_data.entities.Drink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkRepositories extends JpaRepository<Drink, Long> {
}
