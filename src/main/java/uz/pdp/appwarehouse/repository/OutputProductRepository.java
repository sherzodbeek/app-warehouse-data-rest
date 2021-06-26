package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.appwarehouse.entity.InputProduct;
import uz.pdp.appwarehouse.entity.OutputProduct;
import uz.pdp.appwarehouse.projection.OutputProductProjection;

@RepositoryRestResource(path = "outputProduct", collectionResourceRel = "outputProduct", excerptProjection = OutputProductProjection.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {


}
