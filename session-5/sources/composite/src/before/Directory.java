package before;

import java.util.ArrayList;

public class Directory {

    private String name;
    private ArrayList files = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    public void add(Object obj) {
        files.add(obj);
    }

    public void show() {
        System.out.println(CompositeDemo.indent + name);
        CompositeDemo.indent.append("   ");

        for (int i = 0; i < files.size(); ++i) {
            Object obj = files.get(i);
            if (obj instanceof Directory) {
                ((Directory) obj).show();
            } else {
                ((File) obj).show();
            }
        }
        CompositeDemo.indent.setLength(CompositeDemo.indent.length() - 3);
    }
}
