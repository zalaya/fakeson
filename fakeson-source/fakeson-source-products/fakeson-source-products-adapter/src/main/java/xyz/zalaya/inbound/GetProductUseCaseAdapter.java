package xyz.zalaya.inbound;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import xyz.zalaya.model.ProductDomain;
import xyz.zalaya.port.inbound.GetProductUseCase;
import xyz.zalaya.port.outbound.GetProductPort;

@Service
@RequiredArgsConstructor
public class GetProductUseCaseAdapter implements GetProductUseCase {

    private final GetProductPort getProductPort;

    @Override
    public ProductDomain get(Long id) {
        return getProductPort.get(id);
    }

}
