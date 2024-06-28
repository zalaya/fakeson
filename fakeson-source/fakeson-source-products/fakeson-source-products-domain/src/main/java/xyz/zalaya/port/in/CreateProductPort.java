package xyz.zalaya.port.in;

import xyz.zalaya.model.ProductDomain;

public interface CreateProductPort {

    ProductDomain create(ProductDomain product);

}
