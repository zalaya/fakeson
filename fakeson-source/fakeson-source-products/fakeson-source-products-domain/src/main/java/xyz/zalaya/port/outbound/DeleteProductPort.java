package xyz.zalaya.port.outbound;

import xyz.zalaya.model.ProductDomain;

public interface DeleteProductPort {

    ProductDomain delete(Long id);

}
