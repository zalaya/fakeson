package xyz.zalaya.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import xyz.zalaya.model.ProductDomain;
import xyz.zalaya.port.inbound.CreateProductUseCase;
import xyz.zalaya.port.outbound.CreateProductPort;

@Service
@RequiredArgsConstructor
public class CreateProductService implements CreateProductUseCase {

    private final CreateProductPort createProductPort;

    @Override
    public ProductDomain create(ProductDomain product) {
        return createProductPort.create(product);
    }

}
