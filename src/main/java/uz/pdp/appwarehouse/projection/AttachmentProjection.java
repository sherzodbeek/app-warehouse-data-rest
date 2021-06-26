package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.entity.Attachment;

@Projection(name = "attachmentProjection", types = Attachment.class)
public interface AttachmentProjection {
    Integer getId();

    String getName();

    long getSize();

    String getContentType();
}
