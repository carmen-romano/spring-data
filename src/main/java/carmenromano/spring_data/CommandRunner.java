package carmenromano.spring_data;


import carmenromano.spring_data.entities.Menu;
import carmenromano.spring_data.entities.Ordine;
import carmenromano.spring_data.entities.Tavolo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class CommandRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(CommandRunner.class);


    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringComponentsApplication.class);
        Menu m = (Menu) ctx.getBean("menu");
        m.printMenu();
        Tavolo t = (Tavolo) ctx.getBean("tavolo");

        Ordine ordine = new Ordine(t);
        ordine.aggiungiElementoOrdinato(m.getPizzaList().get(2));


        logger.info("Ordine creato:\n{}", ordine);
    }
}
