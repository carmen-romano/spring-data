package carmenromano.spring_data.services;

import carmenromano.spring_data.repositories.PizzaRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

@Service
public class PizzaService {

        @Autowired
        private PizzaRepositories pizzaRepositories;

    }
