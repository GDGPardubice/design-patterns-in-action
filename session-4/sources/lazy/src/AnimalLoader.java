import java.util.List;

public class AnimalLoader {

    private ZooDatabase database;

    public AnimalLoader(ZooDatabase database) {
        this.database = database;
    }
    
    public List<Animal> findAnimalsByCategoryId(int categoryId) {
        return database.getAnimalsByCategoryId(categoryId);
    }
}
