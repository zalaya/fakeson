package xyz.zalaya.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import xyz.zalaya.model.ProductDomain;
import xyz.zalaya.port.inbound.GetProductUseCase;
import xyz.zalaya.port.outbound.GetProductPort;

@Component
@RequiredArgsConstructor
public class GetProductService implements GetProductUseCase {

    private final GetProductPort getProductPort;

    @Override
    public ProductDomain get(Long id) {
        return getProductPort.get(id);
    }

}
