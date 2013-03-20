package persistence;

import domain.Entity;
import storage.IStorage;

/**
 * Abstraction implementation
 */
public class Persistor {

    private IStorage storage;

    public Persistor(IStorage storage) {
        this.storage = storage;
    }

    public void persist(Entity entity) {
        storage.save(entity);
    }

    public Entity getEntityById(int id) {
        return storage.getEntityById(id);
    }

    public Entity deleteEntityById(int id) {
        return storage.deleteEntityById(id);
    }
}
