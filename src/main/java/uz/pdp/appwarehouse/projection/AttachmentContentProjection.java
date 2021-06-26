package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.entity.Attachment;
import uz.pdp.appwarehouse.entity.AttachmentContent;

@Projection(name = "attachmentContentProjection", types = AttachmentContent.class)
public interface AttachmentContentProjection {
    Integer getId();

    byte[] getBytes();

    Attachment getAttachment();
}
