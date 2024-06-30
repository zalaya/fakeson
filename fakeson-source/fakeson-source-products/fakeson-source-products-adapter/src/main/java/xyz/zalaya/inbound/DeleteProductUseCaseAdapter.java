package xyz.zalaya.inbound;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import xyz.zalaya.model.ProductDomain;
import xyz.zalaya.port.inbound.DeleteProductUseCase;
import xyz.zalaya.port.outbound.DeleteProductPort;

@Service
@RequiredArgsConstructor
public class DeleteProductUseCaseAdapter implements DeleteProductUseCase {

    private final DeleteProductPort deleteProductPort;

    @Override
    public ProductDomain delete(Long id) {
        return deleteProductPort.delete(id);
    }

}
