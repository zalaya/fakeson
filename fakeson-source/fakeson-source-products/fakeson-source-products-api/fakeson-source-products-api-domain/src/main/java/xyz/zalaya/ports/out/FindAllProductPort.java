package xyz.zalaya.ports.out;

import xyz.zalaya.models.Product;

import java.util.List;

public interface FindAllProductPort {

    List<Product> findAll();

}
