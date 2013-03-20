/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dpa3_books;

/**
 *
 * @author bazil
 */
public class ISBNBookAdapter implements IAdaptedBook {
    
    private ISBNBook book;
    
    public ISBNBookAdapter(String name, String author, String isbn) {
        this.book = new ISBNBook(name, author, isbn);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(book.getAuthor());
        sb.append(": ");
        sb.append(book.getName());
        return sb.toString();
    }
    
}
