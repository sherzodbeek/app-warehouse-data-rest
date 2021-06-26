package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.appwarehouse.entity.Product;
import uz.pdp.appwarehouse.projection.ProductProjection;

@RepositoryRestResource(path = "product", collectionResourceRel = "product", excerptProjection = ProductProjection.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {

    boolean existsByNameAndCategoryId(String name, Integer category_id);

    @Query(value = "select max(id) from product", nativeQuery = true)
    int getMaxId();
}
