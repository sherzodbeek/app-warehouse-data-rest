package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.appwarehouse.entity.Client;
import uz.pdp.appwarehouse.projection.ClientProjection;

@RepositoryRestResource(path = "client", collectionResourceRel = "client", excerptProjection = ClientProjection.class)
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
