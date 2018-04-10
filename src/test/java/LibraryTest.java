import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LibraryTest {

    Library publicLibrary;
    Book book1;
    Book book2;
    Book book3;


    @Before
    public void before(){
        publicLibrary = new Library("Big Ole Library", 2 );
        book1 = new Book ("The Wasp Factory");
        book2 = new Book ("Contortionists Handbook");
        book3 = new Book ("Guards");
    }

    @Test
    public void hasName(){
        assertEquals("Big Ole Library", publicLibrary.getName());
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, publicLibrary.bookCount());
    }

    @Test
    public void canAddBook(){
        publicLibrary.addBook(book1);
        publicLibrary.addBook(book2);
        assertEquals(2, publicLibrary.bookCount());
    }

     @Test
    public void reachedCapacity(){
         publicLibrary.addBook(book1);
         publicLibrary.addBook(book2);
         publicLibrary.addBook(book3);
         assertEquals(2, publicLibrary.bookCount());
     }


}

