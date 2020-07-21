package ir.fassih.homework.usermanagement.database.test;


import ir.fassih.homework.core.database.entity.MultiTenantId;
import ir.fassih.homework.core.database.entity.TenantDatabaseEntity;
import ir.fassih.homework.usermanagement.database.entity.UserDatabaseEntity;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.UUID;


@SpringBootTest
@Transactional
public class TestUserEntityExistOnDatabase {


    @PersistenceContext
    private EntityManager entityManager;

    @Test
    public void test() {
        TenantDatabaseEntity tenantDatabaseEntity = new TenantDatabaseEntity();
        tenantDatabaseEntity.setName("tenant 1");

        entityManager.persist(tenantDatabaseEntity);

        MultiTenantId id = new MultiTenantId();
        id.setId(UUID.randomUUID().toString());
        id.setTenant(tenantDatabaseEntity);

        UserDatabaseEntity userDatabaseEntity = new UserDatabaseEntity();

        userDatabaseEntity.setEmail("email@someDomain.com");
        userDatabaseEntity.setId(id);

        entityManager.persist(userDatabaseEntity);
    }

}