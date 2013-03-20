package storage;

import domain.Entity;

/**
 * Implementor interface
 */
public interface IStorage {

    void save(Entity object);

    Entity getEntityById(int parseInt);

    Entity deleteEntityById(int parseInt);
}
