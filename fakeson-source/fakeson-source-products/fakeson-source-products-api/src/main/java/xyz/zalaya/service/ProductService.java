package xyz.zalaya.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import xyz.zalaya.model.ProductEntity;
import xyz.zalaya.repository.ProductRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public List<ProductEntity> findAll() {
        return repository.findAll();
    }

    public ProductEntity findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public ProductEntity save(ProductEntity product) {
        return repository.save(product);
    }

    public void delete(ProductEntity product) {
        repository.delete(product);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}
