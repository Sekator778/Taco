package ua.sekator.taco.data;

import org.springframework.data.repository.CrudRepository;
import ua.sekator.taco.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
