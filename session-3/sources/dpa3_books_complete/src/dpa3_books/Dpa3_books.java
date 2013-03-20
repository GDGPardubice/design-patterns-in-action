
package dpa3_books;

public class Dpa3_books {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SimpleBook simpleBook = new SimpleBook("The Hobbit, or There and Back Again", "J.R.R. Tolkien");
        ISBNBook isbnBook = new ISBNBook("Návrhové vzory", "Rudolf Pecinovský", "978-80-251-1582-4");
        
        IAdaptedBook book = new SimpleBookAdapter(simpleBook);
        IAdaptedBook book2 = new ISBNBookAdapter(isbnBook);
        
        System.out.println(book);
        System.out.println(book2);
    }
}
