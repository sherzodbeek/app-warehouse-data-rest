package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.appwarehouse.entity.Input;
import uz.pdp.appwarehouse.projection.InputProjection;

@RepositoryRestResource(path = "input", collectionResourceRel = "input", excerptProjection = InputProjection.class)
public interface InputRepository extends JpaRepository<Input, Integer> {
    @Query(value = "select max(id) from input", nativeQuery = true)
    int getMaxId();
}
