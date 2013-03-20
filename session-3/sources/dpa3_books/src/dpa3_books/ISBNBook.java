/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dpa3_books;

/**
 *
 * @author bazil
 */
public class ISBNBook{
    
    private String isbn;
    private String name;
    private String author;
    
    public ISBNBook(String name, String author, String isbn) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
    }
    
    public String getISBN()
    {
        return this.isbn;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }
    
}
