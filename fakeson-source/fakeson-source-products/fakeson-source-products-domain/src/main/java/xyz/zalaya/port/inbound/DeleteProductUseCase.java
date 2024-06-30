package xyz.zalaya.port.inbound;

import xyz.zalaya.model.ProductDomain;

public interface DeleteProductUseCase {

    ProductDomain delete(Long id);

}
