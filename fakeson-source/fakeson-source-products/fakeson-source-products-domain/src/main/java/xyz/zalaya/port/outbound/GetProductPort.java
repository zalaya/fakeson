package xyz.zalaya.port.outbound;

import xyz.zalaya.model.ProductDomain;

public interface GetProductPort {

    ProductDomain get(Long id);

}
