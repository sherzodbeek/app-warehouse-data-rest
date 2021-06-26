package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.appwarehouse.entity.Supplier;
import uz.pdp.appwarehouse.projection.SupplierProjection;

@RepositoryRestResource(path = "supplier", collectionResourceRel = "supplier", excerptProjection = SupplierProjection.class)
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
