package xyz.zalaya.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import xyz.zalaya.entity.ProductEntity;
import xyz.zalaya.exception.ProductFoundException;
import xyz.zalaya.exception.ProductNotFoundException;
import xyz.zalaya.mapper.ProductMapper;
import xyz.zalaya.model.ProductDomain;
import xyz.zalaya.port.in.CreateProductPort;
import xyz.zalaya.port.in.DeleteProductPort;
import xyz.zalaya.port.in.GetProductPort;
import xyz.zalaya.port.in.UpdateProductPort;
import xyz.zalaya.repository.ProductRepository;

@Service
@RequiredArgsConstructor
public class ProductService implements CreateProductPort, GetProductPort, UpdateProductPort, DeleteProductPort {

    private final ProductRepository repository;
    private final ProductMapper mapper;

    @Override
    public ProductDomain create(ProductDomain product) {
        if (repository.existsById(product.getId())) {
            throw new ProductFoundException("Product with id " + product.getId() + " found");
        }

        return mapper.toDomain(repository.save(mapper.toEntity(product)));
    }

    @Override
    public ProductDomain delete(Long id) {
        ProductEntity entity = repository.findById(id).orElseThrow(() ->
            new ProductNotFoundException("Product with id " + id + " not found")
        );

        repository.delete(entity);

        return mapper.toDomain(entity);
    }

    @Override
    public ProductDomain get(Long id) {
        ProductEntity entity = repository.findById(id).orElseThrow(() ->
            new ProductNotFoundException("Product with id " + id + " not found")
        );

        return mapper.toDomain(entity);
    }

    @Override
    public ProductDomain update(ProductDomain product) {
        if (!repository.existsById(product.getId())) {
            throw new ProductNotFoundException("Product with id " + product.getId() + " not found");
        }

        return mapper.toDomain(repository.save(mapper.toEntity(product)));
    }

}
