package before;

public class CompositeDemo {

    public static StringBuffer indent = new StringBuffer();

    public static void main(String[] args) {
        Directory directory1 = new Directory("dir1"),
                directory2 = new Directory("dir2"),
                directory3 = new Directory("dir3");

        File file1 = new File("a"),
                file2 = new File("b"),
                file3 = new File("c"),
                file4 = new File("d"),
                file5 = new File("e");

        directory1.add(file1);
        directory1.add(directory2);
        directory1.add(file2);
        directory2.add(file3);
        directory2.add(file4);
        directory2.add(directory3);
        directory3.add(file5);
        directory1.show();
    }
}
