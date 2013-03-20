
package dpa3_books;

public class SimpleBookAdapter implements IAdaptedBook {
    
    private SimpleBook book;
    
    public SimpleBookAdapter(SimpleBook book)
    {
        this.book = book;
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
