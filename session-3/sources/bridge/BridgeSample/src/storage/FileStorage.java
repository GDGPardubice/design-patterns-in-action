package storage;

import domain.Entity;
import java.util.ArrayList;
import java.util.List;

/**
 * Concrete implementor
 */
public class FileStorage implements IStorage {

    private Serializer<List<Entity>> serializer;
    private List<Entity> collection;

    public FileStorage(String fileName) {
        serializer = new Serializer<List<Entity>>(fileName);
    }

    @Override
    public void save(Entity object) {
        loadCollection();
        collection.add(object);
        saveCollection();
    }

    @Override
    public Entity getEntityById(int id) {
        loadCollection();
        for (Entity entity : collection) {
            if (entity.getId() == id) {
                return entity;
            }
        }
        return null;
    }

    @Override
    public Entity deleteEntityById(int id) {
        loadCollection();
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i).getId() == id) {
                return collection.remove(i);
            }
        }
        return null;
    }

    private void loadCollection() {
        collection = serializer.load();
        if (!(collection instanceof List)) {
            collection = new ArrayList();
            saveCollection();
        }
    }

    private void saveCollection() {
        serializer.save(collection);
    }
}
