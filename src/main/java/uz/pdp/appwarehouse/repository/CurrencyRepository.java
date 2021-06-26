package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.appwarehouse.entity.Currency;
import uz.pdp.appwarehouse.projection.CurrencyProjection;

@RepositoryRestResource(path = "currency", collectionResourceRel = "currency", excerptProjection = CurrencyProjection.class)
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {
}
