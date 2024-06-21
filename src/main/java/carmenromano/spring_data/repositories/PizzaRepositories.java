package carmenromano.spring_data.repositories;

import carmenromano.spring_data.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepositories extends JpaRepository<Pizza,Long> {

}
