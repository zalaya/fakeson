package xyz.zalaya.port.outbound;

import xyz.zalaya.model.ProductDomain;

public interface CreateProductPort {

    ProductDomain create(ProductDomain product);

}
