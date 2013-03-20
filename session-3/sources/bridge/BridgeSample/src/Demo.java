
import domain.Entity;
import persistence.LogPersistor;
import persistence.Persistor;
import storage.FileStorage;
import storage.MemoryStorage;

public class Demo {

    public static void main(String[] args) {
        Persistor persistor = new LogPersistor(new MemoryStorage());
        persistor.persist(new Entity(1, "Entity 1"));
        System.out.println(persistor.getEntityById(1));
    }
}
