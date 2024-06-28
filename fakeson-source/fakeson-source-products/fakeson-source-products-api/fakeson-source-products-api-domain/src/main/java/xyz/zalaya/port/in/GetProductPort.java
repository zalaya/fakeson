package xyz.zalaya.port.in;

import xyz.zalaya.model.ProductDomain;

public interface GetProductPort {

    ProductDomain get(Long id);

}
