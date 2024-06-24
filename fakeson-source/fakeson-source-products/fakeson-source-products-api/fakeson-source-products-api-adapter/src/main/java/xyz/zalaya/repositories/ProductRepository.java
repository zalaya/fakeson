package xyz.zalaya.repositories;

import lombok.RequiredArgsConstructor;
import xyz.zalaya.models.Product;
import xyz.zalaya.ports.out.*;

import java.util.List;

@RequiredArgsConstructor
public class ProductRepository implements FindAllProductPort, FindByIdProductPort, SaveProductPort, DeleteProductPort, DeleteByIdProductPort {

    private final ProductJpaRepository jpaRepository;

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public Product findById(Long id) {
        return null;
    }

    @Override
    public void save(Product product) {

    }

}
