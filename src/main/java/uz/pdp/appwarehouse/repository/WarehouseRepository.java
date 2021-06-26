package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.appwarehouse.entity.Warehouse;
import uz.pdp.appwarehouse.projection.WarehouseProjection;

@RepositoryRestResource(path = "warehouse", collectionResourceRel = "warehouse", excerptProjection = WarehouseProjection.class)
public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {
}
