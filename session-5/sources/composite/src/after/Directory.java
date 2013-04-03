package after;

import java.util.ArrayList;

public class Directory implements AbstractFile {

    private String name;
    private ArrayList<AbstractFile> files = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    public void add(AbstractFile obj) {
        files.add(obj);
    }

    public void show() {
        System.out.println(CompositeDemo.indent + name);
        CompositeDemo.indent.append("   ");

        for (AbstractFile abstractFile : files) {
            abstractFile.show();
        }
        CompositeDemo.indent.setLength(CompositeDemo.indent.length() - 3);
    }
}
