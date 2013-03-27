
import java.util.List;

public class Category {

    private int id;
    private String name;
    private List<Animal> animals;
    private AnimalLoader articleLoader;

    public Category(AnimalLoader articleLoader) {
        // System.out.println("Load category");
        this.articleLoader = articleLoader;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Animal> getArticles() {
        if (animals == null) {
            animals = articleLoader.findAnimalsByCategoryId(getId());
        }
        return animals;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
