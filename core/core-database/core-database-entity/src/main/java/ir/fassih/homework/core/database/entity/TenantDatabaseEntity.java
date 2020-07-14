package ir.fassih.homework.core.database.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Table(name = "TENANTS")
@Entity
public class TenantDatabaseEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;



}
