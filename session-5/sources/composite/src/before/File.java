package before;

public class File {

    private String name;

    public File(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(CompositeDemo.indent + name);
    }
}
