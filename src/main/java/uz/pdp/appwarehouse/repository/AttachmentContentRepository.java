package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.appwarehouse.entity.AttachmentContent;
import uz.pdp.appwarehouse.projection.AttachmentContentProjection;

import java.util.Optional;

@RepositoryRestResource(path = "attachmentContent", collectionResourceRel = "attachment", excerptProjection = AttachmentContentProjection.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Integer> {

    Optional<AttachmentContent> findByAttachmentId(Integer integer);
}
