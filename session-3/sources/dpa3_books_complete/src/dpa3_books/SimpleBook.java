
package dpa3_books;

public class SimpleBook{
    
    private String name;
    private String author;
    
    public SimpleBook(String name, String author)
    {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return this.name;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
}
