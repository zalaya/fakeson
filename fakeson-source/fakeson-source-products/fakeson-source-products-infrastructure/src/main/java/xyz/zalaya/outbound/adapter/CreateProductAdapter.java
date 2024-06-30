package xyz.zalaya.outbound.adapter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import xyz.zalaya.inbound.exception.ProductFoundException;
import xyz.zalaya.mapper.ProductMapper;
import xyz.zalaya.model.ProductDomain;
import xyz.zalaya.outbound.repository.ProductRepository;
import xyz.zalaya.port.outbound.CreateProductPort;

@Component
@RequiredArgsConstructor
public class CreateProductAdapter implements CreateProductPort {

    private final ProductRepository repository;
    private final ProductMapper mapper;

    @Override
    public ProductDomain create(ProductDomain product) {
        if (repository.existsById(product.getId())) {
            throw new ProductFoundException("Product with id " + product.getId() + " found");
        }

        return mapper.toDomain(repository.save(mapper.toEntity(product)));
    }

}
