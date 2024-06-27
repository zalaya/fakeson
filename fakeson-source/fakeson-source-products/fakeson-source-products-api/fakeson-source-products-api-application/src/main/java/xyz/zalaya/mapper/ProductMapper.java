package xyz.zalaya.mapper;

import xyz.zalaya.entity.ProductEntity;
import xyz.zalaya.model.ProductDomain;

import java.util.List;
import java.util.stream.Collectors;

public class ProductMapper {

    public ProductDomain toDomain(ProductEntity entity) {
        return new ProductDomain(
            entity.getId(),
            entity.getName(),
            entity.getDescription(),
            entity.getPrice()
        );
    }

    public ProductEntity toEntity(ProductDomain domain) {
        return new ProductEntity(
            domain.getId(),
            domain.getName(),
            domain.getDescription(),
            domain.getPrice()
        );
    }

    public List<ProductDomain> toDomain(List<ProductEntity> entities) {
        return entities.stream().map(this::toDomain).collect(Collectors.toList());
    }

    public List<ProductEntity> toEntity(List<ProductDomain> domains) {
        return domains.stream().map(this::toEntity).collect(Collectors.toList());
    }

}
