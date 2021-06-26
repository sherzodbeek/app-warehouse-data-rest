package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.entity.Currency;
import uz.pdp.appwarehouse.entity.Input;
import uz.pdp.appwarehouse.entity.Supplier;
import uz.pdp.appwarehouse.entity.Warehouse;

import java.sql.Timestamp;

@Projection(name = "inputProjection", types = Input.class)
public interface InputProjection {
    Integer getId();

    Timestamp getDate();

    Warehouse getWarehouse();

    Supplier getSupplier();

    Currency getCurrency();

    Supplier getFactureNumber();

    Integer getCode();
}
