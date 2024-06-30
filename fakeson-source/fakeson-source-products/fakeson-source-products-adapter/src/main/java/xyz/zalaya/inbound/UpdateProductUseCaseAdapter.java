package xyz.zalaya.inbound;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import xyz.zalaya.model.ProductDomain;
import xyz.zalaya.port.inbound.UpdateProductUseCase;
import xyz.zalaya.port.outbound.UpdateProductPort;

@Service
@RequiredArgsConstructor
public class UpdateProductUseCaseAdapter implements UpdateProductUseCase {

    private final UpdateProductPort updateProductPort;

    @Override
    public ProductDomain update(ProductDomain product) {
        return updateProductPort.update(product);
    }

}
