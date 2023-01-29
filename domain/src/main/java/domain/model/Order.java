package domain.model;

import lombok.Data;

@Data
public class Order {
    private int id;
    private String name;
    OrderStatus orderStatus;
}