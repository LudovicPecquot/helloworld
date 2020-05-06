package test.dao;

import test.model.Entity;

/**
 * @author peck7 on 06/05/2020.
 */
public interface EntityRepository {

    Entity getByLabel(String label);
}
