package xyz.zalaya.repositories;

import lombok.RequiredArgsConstructor;
import xyz.zalaya.mappers.ProductMapper;
import xyz.zalaya.models.Product;
import xyz.zalaya.ports.out.ProductOutPort;

import java.util.List;

@RequiredArgsConstructor
public class ProductRepository implements ProductOutPort {

    private final ProductJpaRepository jpaRepository;
    private final ProductMapper mapper;

    @Override
    public void save(Product product) {
        jpaRepository.save(mapper.toEntity(product));
    }

    @Override
    public Product findById(Long id) {
        return jpaRepository.findById(id).map(mapper::toDomain).orElse(null);
    }

    @Override
    public List<Product> findAll() {
        return mapper.toDomain(jpaRepository.findAll());
    }

    @Override
    public void deleteById(Long id) {
        jpaRepository.deleteById(id);
    }

    @Override
    public void update(Product product) {
        jpaRepository.save(mapper.toEntity(product));
    }

}
