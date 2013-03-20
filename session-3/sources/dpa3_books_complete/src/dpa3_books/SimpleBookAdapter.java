
package dpa3_books;

public class SimpleBookAdapter implements IAdaptedBook {
    
    private SimpleBook book;
    
    public SimpleBookAdapter(String name, String author)
    {
        this.book = new SimpleBook(name, author);
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(book.getAuthor());
        sb.append(": ");
        sb.append(book.getName());
        
        return sb.toString();
    }
    
}
