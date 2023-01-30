package domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Dish - блюдо
 */
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Dish {
    @EqualsAndHashCode.Include
    private int id;
    private String name;
}
