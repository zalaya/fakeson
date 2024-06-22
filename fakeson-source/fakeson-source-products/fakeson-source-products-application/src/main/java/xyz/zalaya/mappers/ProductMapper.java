package xyz.zalaya.mappers;

import xyz.zalaya.entities.ProductEntity;
import xyz.zalaya.models.Product;

import java.util.List;

public class ProductMapper {

    public Product toDomain(ProductEntity entity) {
        return new Product(
            entity.getId(),
            entity.getName(),
            entity.getDescription(),
            entity.getPrice()
        );
    }

    public ProductEntity toEntity(Product domain) {
        return new ProductEntity(
            domain.getId(),
            domain.getName(),
            domain.getDescription(),
            domain.getPrice()
        );
    }

    public List<Product> toDomain(List<ProductEntity> entities) {
        return entities.stream().map(this::toDomain).toList();
    }

    public List<ProductEntity> toEntity(List<Product> domains) {
        return domains.stream().map(this::toEntity).toList();
    }

}
