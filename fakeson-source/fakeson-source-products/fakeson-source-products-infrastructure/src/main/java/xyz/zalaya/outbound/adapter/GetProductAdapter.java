package xyz.zalaya.outbound.adapter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import xyz.zalaya.inbound.entity.ProductEntity;
import xyz.zalaya.inbound.exception.ProductNotFoundException;
import xyz.zalaya.mapper.ProductMapper;
import xyz.zalaya.model.ProductDomain;
import xyz.zalaya.outbound.repository.ProductRepository;
import xyz.zalaya.port.outbound.GetProductPort;

@Component
@RequiredArgsConstructor
public class GetProductAdapter implements GetProductPort {

    private final ProductRepository repository;
    private final ProductMapper mapper;

    @Override
    public ProductDomain get(Long id) {
        ProductEntity entity = repository.findById(id).orElseThrow(() ->
            new ProductNotFoundException("Product with id " + id + " not found")
        );

        return mapper.toDomain(entity);
    }

}
