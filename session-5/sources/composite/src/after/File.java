package after;

class File implements AbstractFile {

    private String name;

    public File(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(CompositeDemo.indent + name);
    }
}
