package xyz.zalaya.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDomain {

    private Long id;
    private String name;
    private String description;
    private BigDecimal price;

}
