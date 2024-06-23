package xyz.zalaya.ports.in;

import xyz.zalaya.models.Product;

public interface ProductInPort {

    void get(Long id);

    void create(Product product);

    void modify(Product product);

    void remove(Long id);

}