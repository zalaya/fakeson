package xyz.zalaya.outbound.adapter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import xyz.zalaya.inbound.exception.ProductNotFoundException;
import xyz.zalaya.mapper.ProductMapper;
import xyz.zalaya.model.ProductDomain;
import xyz.zalaya.outbound.repository.ProductRepository;
import xyz.zalaya.port.outbound.UpdateProductPort;

@Component
@RequiredArgsConstructor
public class UpdateProductAdapter implements UpdateProductPort {

    private final ProductRepository repository;
    private final ProductMapper mapper;

    @Override
    public ProductDomain update(ProductDomain product) {
        if (!repository.existsById(product.getId())) {
            throw new ProductNotFoundException("Product with id " + product.getId() + " not found");
        }

        return mapper.toDomain(repository.save(mapper.toEntity(product)));
    }

}
