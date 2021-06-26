package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.entity.Measurement;

@Projection(name = "measurementProjection", types = Measurement.class)
public interface MeasurementProjection {
    Integer getId();

    String getName();

    boolean getActive();
}
