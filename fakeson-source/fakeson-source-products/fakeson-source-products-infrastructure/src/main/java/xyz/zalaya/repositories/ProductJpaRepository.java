package xyz.zalaya.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.zalaya.entities.ProductEntity;

public interface ProductJpaRepository extends JpaRepository<ProductEntity, Long> {

}
