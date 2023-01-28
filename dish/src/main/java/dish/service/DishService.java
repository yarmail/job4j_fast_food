package dish.service;

import domain.model.Dish;

import java.util.List;
import java.util.Optional;

public interface DishService {
    Optional<Dish> addDish(Dish dish);
    Optional<Dish> editDish(Dish dish);
    boolean deleteDish(Dish dish);
    Optional<Dish> findDishById(int id);
    List<Dish> findAllDishes();
}
