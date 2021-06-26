package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.appwarehouse.entity.Input;
import uz.pdp.appwarehouse.entity.Output;
import uz.pdp.appwarehouse.projection.OutputProjection;

@RepositoryRestResource(path = "output", collectionResourceRel = "output", excerptProjection = OutputProjection.class)
public interface OutputRepository extends JpaRepository<Output, Integer> {
    @Query(value = "select max(id) from output", nativeQuery = true)
    int getMaxId();
}
