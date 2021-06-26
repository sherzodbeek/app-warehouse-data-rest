package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.appwarehouse.entity.InputProduct;
import uz.pdp.appwarehouse.projection.InputProductProjection;

@RepositoryRestResource(path = "inputProduct", collectionResourceRel = "inputProduct", excerptProjection = InputProductProjection.class)
public interface InputProductRepository extends JpaRepository<InputProduct, Integer> {


}
