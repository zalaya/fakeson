package xyz.zalaya.models;

import xyz.zalaya.models.enums.ProductBrand;
import xyz.zalaya.models.enums.ProductCategory;
import xyz.zalaya.models.enums.ProductColor;
import xyz.zalaya.models.enums.ProductStock;

public class Product {
    private Integer id;
    private String name;
    private String description;
    private Double price;
    private ProductBrand brand;
    private ProductCategory category;
    private ProductStock stock;
    private ProductColor color;
}
