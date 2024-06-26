package xyz.zalaya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.zalaya.model.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}
