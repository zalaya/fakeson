package xyz.zalaya.ports.out;

import xyz.zalaya.models.Product;

public interface FindByIdProductPort {

    Product findById(Long id);

}
