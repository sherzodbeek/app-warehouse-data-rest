package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.entity.*;

import java.sql.Timestamp;

@Projection(name = "outputProjection", types = Output.class)
public interface OutputProjection {
    Integer getId();

    Timestamp getDate();

    Warehouse getWarehouse();

    Client getClient();

    Currency getCurrency();

    Supplier getFactureNumber();

    Integer getCode();
}
