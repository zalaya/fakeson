package xyz.zalaya.services;

import lombok.RequiredArgsConstructor;
import xyz.zalaya.models.Product;
import xyz.zalaya.ports.in.ProductInPort;
import xyz.zalaya.repositories.ProductRepository;

@RequiredArgsConstructor
public class ProductService implements ProductInPort {

    private final ProductRepository repository;

    @Override
    public void get(Long id) {
        repository.findById(id);
    }

    @Override
    public void create(Product product) {
        repository.save(product);
    }

    @Override
    public void modify(Product product) {
        repository.update(product);
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }

}
