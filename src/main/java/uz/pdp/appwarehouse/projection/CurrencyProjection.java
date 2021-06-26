package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.entity.Currency;

@Projection(name = "currencyProjection", types = Currency.class)
public interface CurrencyProjection {
    Integer getId();

    String getName();

    boolean getActive();
}
