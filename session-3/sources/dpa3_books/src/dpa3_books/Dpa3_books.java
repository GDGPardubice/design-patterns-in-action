/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dpa3_books;

/**
 *
 * @author bazil
 */
public class Dpa3_books {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleBook simpleBook = new SimpleBook("The Hobbit, or There and Back Again", "J.R.R. Tolkien");
        ISBNBook isbnBook = new ISBNBook("Návrhové vzory", "Rudolf Pecinovský", "978-80-251-1582-4");
        
        
        //NOTE: náš system chce metodu toString();
        System.out.println(simpleBook);
        System.out.println(isbnBook);
    }
}
