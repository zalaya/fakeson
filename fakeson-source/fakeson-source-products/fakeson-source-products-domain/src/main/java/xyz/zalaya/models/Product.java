package xyz.zalaya.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Product {

    private Long id;
    private String name;
    private String description;
    private Double price;

}
