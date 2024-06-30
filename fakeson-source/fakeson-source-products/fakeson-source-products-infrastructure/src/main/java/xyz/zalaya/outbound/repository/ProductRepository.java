package xyz.zalaya.outbound.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.zalaya.inbound.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}
