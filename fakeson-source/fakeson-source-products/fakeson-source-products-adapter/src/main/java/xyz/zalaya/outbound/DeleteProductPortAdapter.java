package xyz.zalaya.outbound;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import xyz.zalaya.entity.ProductEntity;
import xyz.zalaya.exception.ProductNotFoundException;
import xyz.zalaya.mapper.ProductMapper;
import xyz.zalaya.model.ProductDomain;
import xyz.zalaya.port.outbound.DeleteProductPort;
import xyz.zalaya.repository.ProductRepository;

@Component
@RequiredArgsConstructor
public class DeleteProductPortAdapter implements DeleteProductPort {

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
