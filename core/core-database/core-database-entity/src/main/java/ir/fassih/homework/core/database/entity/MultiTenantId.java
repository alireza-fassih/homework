package ir.fassih.homework.core.database.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Data
public class MultiTenantId implements Serializable {

    @ManyToOne
    @JoinColumn(nullable = false, name = "TENANT_ID")
    private TenantDatabaseEntity tenant;

    @Column(nullable = false)
    private String id;

}
