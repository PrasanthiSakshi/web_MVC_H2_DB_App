package in.sakshi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sakshi.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer>{

}
