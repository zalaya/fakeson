package xyz.zalaya.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xyz.zalaya.model.ProductDomain;
import xyz.zalaya.port.in.CreateProductPort;
import xyz.zalaya.port.in.DeleteProductPort;
import xyz.zalaya.port.in.GetProductPort;
import xyz.zalaya.port.in.UpdateProductPort;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final CreateProductPort createProductPort;
    private final GetProductPort getProductPort;
    private final UpdateProductPort updateProductPort;
    private final DeleteProductPort deleteProductPort;

    @GetMapping("/{id}")
    public ResponseEntity<ProductDomain> get(@PathVariable Long id) {
        return ResponseEntity.ok(getProductPort.get(id));
    }

    @PostMapping()
    public ResponseEntity<ProductDomain> create(@RequestBody ProductDomain productDomain) {
        return ResponseEntity.ok(createProductPort.create(productDomain));
    }

    @PutMapping()
    public ResponseEntity<ProductDomain> update(@RequestBody ProductDomain productDomain) {
        return ResponseEntity.ok(updateProductPort.update(productDomain));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ProductDomain> delete(@PathVariable Long id) {
        return ResponseEntity.ok(deleteProductPort.delete(id));
    }

}
