package ir.fassih.homework.usermanagement.database.entity;

import ir.fassih.homework.core.database.entity.AbstractMultiTenantDatabaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Table(name = "USERS")
@Entity
@EqualsAndHashCode(callSuper = true)
public class UserDatabaseEntity extends AbstractMultiTenantDatabaseEntity {

    @Column(nullable = false, name = "EMAIL")
    private String email;

}
