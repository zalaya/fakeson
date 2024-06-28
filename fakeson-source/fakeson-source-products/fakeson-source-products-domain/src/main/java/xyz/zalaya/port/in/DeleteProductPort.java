package xyz.zalaya.port.in;

import xyz.zalaya.model.ProductDomain;

public interface DeleteProductPort {

    ProductDomain delete(Long id);

}
