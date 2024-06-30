package xyz.zalaya.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import xyz.zalaya.model.ProductDomain;
import xyz.zalaya.port.inbound.UpdateProductUseCase;
import xyz.zalaya.port.outbound.UpdateProductPort;

@Component
@RequiredArgsConstructor
public class UpdateProductService implements UpdateProductUseCase {

    private final UpdateProductPort updateProductPort;

    @Override
    public ProductDomain update(ProductDomain product) {
        return updateProductPort.update(product);
    }

}
