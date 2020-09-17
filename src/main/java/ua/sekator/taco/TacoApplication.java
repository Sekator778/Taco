package ua.sekator.taco;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ua.sekator.taco.data.IngredientRepository;
import ua.sekator.taco.domain.Ingredient;
import ua.sekator.taco.domain.Ingredient.Type;

@SpringBootApplication
public class TacoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TacoApplication.class, args);
    }
}
