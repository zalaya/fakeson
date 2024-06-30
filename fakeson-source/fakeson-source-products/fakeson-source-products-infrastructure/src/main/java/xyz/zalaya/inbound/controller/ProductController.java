package xyz.zalaya.inbound.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xyz.zalaya.model.ProductDomain;
import xyz.zalaya.port.inbound.CreateProductUseCase;
import xyz.zalaya.port.inbound.DeleteProductUseCase;
import xyz.zalaya.port.inbound.GetProductUseCase;
import xyz.zalaya.port.inbound.UpdateProductUseCase;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final CreateProductUseCase createProductUseCase;
    private final GetProductUseCase getProductUseCase;
    private final UpdateProductUseCase updateProductUseCase;
    private final DeleteProductUseCase deleteProductUseCase;

    @GetMapping("/{id}")
    public ResponseEntity<ProductDomain> get(@PathVariable Long id) {
        return ResponseEntity.ok(getProductUseCase.get(id));
    }

    @PostMapping()
    public ResponseEntity<ProductDomain> create(@RequestBody ProductDomain productDomain) {
        return ResponseEntity.ok(createProductUseCase.create(productDomain));
    }

    @PutMapping()
    public ResponseEntity<ProductDomain> update(@RequestBody ProductDomain productDomain) {
        return ResponseEntity.ok(updateProductUseCase.update(productDomain));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ProductDomain> delete(@PathVariable Long id) {
        return ResponseEntity.ok(deleteProductUseCase.delete(id));
    }

}
