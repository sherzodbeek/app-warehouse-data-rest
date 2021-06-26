package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.appwarehouse.entity.Category;
import uz.pdp.appwarehouse.projection.CategoryProjection;

@RepositoryRestResource(path = "category", collectionResourceRel = "category", excerptProjection = CategoryProjection.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
