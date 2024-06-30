package xyz.zalaya.outbound.adapter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import xyz.zalaya.inbound.entity.ProductEntity;
import xyz.zalaya.inbound.exception.ProductNotFoundException;
import xyz.zalaya.mapper.ProductMapper;
import xyz.zalaya.model.ProductDomain;
import xyz.zalaya.outbound.repository.ProductRepository;
import xyz.zalaya.port.outbound.DeleteProductPort;

@Component
@RequiredArgsConstructor
public class DeleteProductAdapter implements DeleteProductPort {

    private final ProductRepository repository;
    private final ProductMapper mapper;

    @Override
    public ProductDomain delete(Long id) {
        ProductEntity entity = repository.findById(id).orElseThrow(() ->
            new ProductNotFoundException("Product with id " + id + " not found")
        );

        repository.delete(entity);

        return mapper.toDomain(entity);
    }

}
