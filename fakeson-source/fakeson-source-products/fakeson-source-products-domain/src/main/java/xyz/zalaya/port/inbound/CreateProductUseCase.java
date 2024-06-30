package xyz.zalaya.port.inbound;

import xyz.zalaya.model.ProductDomain;

public interface CreateProductUseCase {

    ProductDomain create(ProductDomain product);

}
