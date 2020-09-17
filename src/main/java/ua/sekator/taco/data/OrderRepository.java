package ua.sekator.taco.data;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import ua.sekator.taco.domain.Order;
import ua.sekator.taco.domain.User;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {
    List<Order> findByUserOrderByPlacedAtDesc(User user, Pageable pageable);
}
