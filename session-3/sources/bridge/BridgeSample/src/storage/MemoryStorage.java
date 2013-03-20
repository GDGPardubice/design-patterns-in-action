package storage;

import domain.Entity;
import java.util.ArrayList;
import java.util.List;

/**
 * Concrete implementor
 */
public class MemoryStorage implements IStorage {

    private List<Entity> collection = new ArrayList<Entity>();

    @Override
    public void save(Entity object) {
        collection.add(object);

    }

    @Override
    public Entity getEntityById(int id) {
        for (Entity entity : collection) {
            if (entity.getId() == id) {
                return entity;
            }
        }
        return null;
    }

    @Override
    public Entity deleteEntityById(int id) {
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i).getId() == id) {
                return collection.remove(i);
            }
        }
        return null;
    }
}
