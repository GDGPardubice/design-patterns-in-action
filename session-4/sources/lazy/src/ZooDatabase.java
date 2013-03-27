
import java.util.ArrayList;
import java.util.List;

public class ZooDatabase {

    private List<Category> categories;
    private List<Animal> animals;

    public ZooDatabase() {
    }

    private void initializeCategories() {
        categories = new ArrayList<>();
        Category category1 = new Category(new AnimalLoader(this));
        category1.setId(1);

        Category category2 = new Category(new AnimalLoader(this));
        category2.setId(2);

        category1.setName("Medvědi");
        category2.setName("Kočky");

        categories.add(category1);
        categories.add(category2);
    }

    public List<Category> getAllCategories() {
        if (categories == null) {
            initializeCategories();
        }
        return categories;
    }

    public List<Animal> getAnimalsByCategoryId(int id) {
        animals = new ArrayList<>();
        if (id == 1) {
            animals.add(new Animal(1, "Lední mědvěd"));
            animals.add(new Animal(2, "Panda"));
        } else if (id == 2) {
            animals.add(new Animal(3, "Mourek"));
            animals.add(new Animal(4, "Tygr"));
        }
        return animals;
    }
}
