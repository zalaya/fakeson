package xyz.zalaya.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import xyz.zalaya.model.ProductEntity;
import xyz.zalaya.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @GetMapping()
    public List<ProductEntity> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ProductEntity findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping()
    public ProductEntity save(@RequestBody ProductEntity product) {
        return service.save(product);
    }

    @DeleteMapping()
    public void delete(@RequestBody ProductEntity product) {
        service.delete(product);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }

}
