package xyz.zalaya.port.inbound;

import xyz.zalaya.model.ProductDomain;

public interface UpdateProductUseCase {

    ProductDomain update(ProductDomain product);

}
