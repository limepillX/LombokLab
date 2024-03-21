package org.example;

import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Getter
@Setter
@AllArgsConstructor
@Data
@EqualsAndHashCode(exclude = {"model", "year", "price", "color", "quantity"})
public class CarWithLombok {
    private String model;
    private String brand;
    private int year;
    private int price;
    private String color;
    private int quantity;
}
