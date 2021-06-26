package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.entity.Input;
import uz.pdp.appwarehouse.entity.InputProduct;
import uz.pdp.appwarehouse.entity.Product;

import java.sql.Date;

@Projection(name = "inputProductProjection", types = InputProduct.class)
public interface InputProductProjection {
    Integer getId();

    Product getProduct();

    Double getAmount();

    Double getPrice();

    Date getExpiredDate();

    Input getInput();
}
