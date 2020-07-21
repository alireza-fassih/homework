package ir.fassih.homework.core.database.tester;

import ir.fassih.homework.core.database.entity.TenantDatabaseEntity;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@SpringBootTest
@Transactional
class TestTenantDatabaseEntity {

    @PersistenceContext
    private EntityManager entityManager;


    @Test
    public void test() {
        TenantDatabaseEntity tenantDatabaseEntity = new TenantDatabaseEntity();
        tenantDatabaseEntity.setName("tenant 1");

        entityManager.persist(tenantDatabaseEntity);


        List<TenantDatabaseEntity> allTenants = entityManager.createQuery("SELECT tde FROM TenantDatabaseEntity tde", TenantDatabaseEntity.class)
                .getResultList();

        Assert.assertEquals(1, allTenants.size());
        Assert.assertEquals(tenantDatabaseEntity, allTenants.get(0));

    }

}