package xyz.zalaya.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDomain {

    private Long id;
    private String name;
    private String description;
    private Double price;

}
