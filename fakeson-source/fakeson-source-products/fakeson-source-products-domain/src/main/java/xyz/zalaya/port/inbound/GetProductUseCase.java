package xyz.zalaya.port.inbound;

import xyz.zalaya.model.ProductDomain;

public interface GetProductUseCase {

    ProductDomain get(Long id);

}
