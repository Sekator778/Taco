package ua.sekator.taco.data;

import org.springframework.data.repository.CrudRepository;
import ua.sekator.taco.domain.Ingredient;

/**
 *
 */

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
