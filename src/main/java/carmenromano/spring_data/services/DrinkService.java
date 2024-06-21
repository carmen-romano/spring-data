package carmenromano.spring_data.services;

import carmenromano.spring_data.entities.Drink;
import carmenromano.spring_data.repositories.DrinkRepositories;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DrinkService {
    @Autowired
    public DrinkRepositories drinkRepositories;

    public void saveDrink(Drink newDrink) {


    }

}
