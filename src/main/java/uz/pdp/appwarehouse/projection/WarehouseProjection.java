package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.entity.Warehouse;

@Projection(name = "warehouseProjection", types = Warehouse.class)
public interface WarehouseProjection {
    Integer getId();

    String getName();

    boolean getActive();
}
