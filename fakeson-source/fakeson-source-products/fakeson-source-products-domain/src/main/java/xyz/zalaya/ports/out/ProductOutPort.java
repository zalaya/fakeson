package xyz.zalaya.ports.out;

import xyz.zalaya.models.Product;

import java.util.List;

public interface ProductOutPort {

    void save(Product product);
    Product findById(Long id);
    List<Product> findAll();
    void deleteById(Long id);
    void update(Product product);

}
