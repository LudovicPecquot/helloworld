package test.dao;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import test.model.Entity;

import javax.persistence.EntityManager;

/**
 * @author peck7 on 06/05/2020.
 */
public class EntityRepositoryImpl
    extends SimpleJpaRepository<Entity, Integer>
    implements EntityRepository {

    public EntityRepositoryImpl(Class<Entity> domainClass, EntityManager em) {
        super(domainClass, em);
    }

    @Override
    public Entity getOne(Integer integer) {
        Entity entity = super.getOne(integer);

        // try to Ctrl+Space

        return entity;
    }

    public Entity getByLabel(String label) {

        // try to Ctrl+Space

        return null;
    }
}
