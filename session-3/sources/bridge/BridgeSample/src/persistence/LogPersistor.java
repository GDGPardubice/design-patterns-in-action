package persistence;

import domain.Entity;
import storage.IStorage;

/**
 * Abstraction implementation
 */
public class LogPersistor extends Persistor {

    public LogPersistor(IStorage storage) {
        super(storage);
    }

    @Override
    public void persist(Entity entity) {
        System.out.println("Persisting entity: " + entity);
        super.persist(entity);
    }

    @Override
    public Entity getEntityById(int id) {
        System.out.println("Loading entity: " + id);
        return super.getEntityById(id);
    }

    @Override
    public Entity deleteEntityById(int id) {
        System.out.println("Removing entity: " + id);
        return super.deleteEntityById(id);
    }
}
