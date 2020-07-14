package ir.fassih.homework.core.database.entity;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.MappedSuperclass;


@Data
@MappedSuperclass
public class AbstractMultiTenantDatabaseEntity {

    @EmbeddedId
    private MultiTenantId id;

}
