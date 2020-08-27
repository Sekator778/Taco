package ua.sekator.taco.data;

import org.springframework.data.repository.CrudRepository;
import ua.sekator.taco.domain.Taco;

/**
 *
 */

public interface TacoRepository extends CrudRepository<Taco, Long> {
}
