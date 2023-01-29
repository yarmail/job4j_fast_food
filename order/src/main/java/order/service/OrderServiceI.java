package order.service;

import domain.model.Order;

import java.util.List;
import java.util.Optional;

public interface OrderServiceI {
    Optional<Order> save(Order order);
    List<Order> findAll();
    Optional<Order> findById(int id);
    boolean deleteById(int id);
}