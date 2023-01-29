package order.controller;

import domain.model.Order;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping()
    public List<Order> findAll() {
        return null;
    }

    @GetMapping("/{id}")
    public Order findById(@PathVariable int id) {
        return null;
    }

    @PostMapping()
    public Order save(@RequestBody Order order) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
    }
}