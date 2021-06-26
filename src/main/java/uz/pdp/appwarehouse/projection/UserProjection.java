package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.entity.User;
import uz.pdp.appwarehouse.entity.Warehouse;

import java.util.Set;

@Projection(name = "userProjection", types = User.class)
public interface UserProjection {
    Integer getId();

    String getFirstName();

    String getLastName();

    String getPhoneNumber();

    Integer getCode();

    String getPassword();

    boolean getActive();

    Set<Warehouse> getWarehouses();
}
