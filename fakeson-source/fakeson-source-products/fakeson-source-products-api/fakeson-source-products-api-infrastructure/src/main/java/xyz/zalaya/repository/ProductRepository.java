package xyz.zalaya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.zalaya.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}
