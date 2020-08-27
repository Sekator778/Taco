package ua.sekator.taco.data;

import org.springframework.data.repository.CrudRepository;
import ua.sekator.taco.domain.User;

/**
 *
 */

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String name);
}
