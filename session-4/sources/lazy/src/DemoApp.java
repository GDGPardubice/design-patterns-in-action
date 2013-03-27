
import java.util.List;

public class DemoApp {

    public static void main(String[] args) {
        ZooDatabase database = new ZooDatabase();

        List<Category> categories = database.getAllCategories();
        for (Category category : categories) {
            System.out.println("Category: " + category.getName());

            System.out.print("--> ");
            for (Animal animal : category.getArticles()) {
                System.out.print(animal.getName() + " ");
            }
            System.out.println("\n");
        }
    }
}
