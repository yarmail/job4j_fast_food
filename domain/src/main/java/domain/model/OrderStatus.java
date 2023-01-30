package domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class OrderStatus {
    @EqualsAndHashCode.Include
    private int id;
    private String name;
}
