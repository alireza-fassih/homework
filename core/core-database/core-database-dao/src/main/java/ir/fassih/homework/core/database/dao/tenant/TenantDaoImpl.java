package ir.fassih.homework.core.database.dao.tenant;

import ir.fassih.homework.core.database.entity.TenantDatabaseEntity;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Slf4j
@Named
class TenantDaoImpl implements TenantDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void save(TenantDatabaseEntity entity) {
        entityManager.persist(entity);
    }

    @Override
    public TenantDatabaseEntity load(Long id) {
        return entityManager.find(TenantDatabaseEntity.class, id);
    }


}
