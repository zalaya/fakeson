package xyz.zalaya.outbound;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import xyz.zalaya.exception.ProductFoundException;
import xyz.zalaya.mapper.ProductMapper;
import xyz.zalaya.model.ProductDomain;
import xyz.zalaya.port.outbound.CreateProductPort;
import xyz.zalaya.repository.ProductRepository;

@Component
@RequiredArgsConstructor
public class CreateProductPortAdapter implements CreateProductPort {

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
