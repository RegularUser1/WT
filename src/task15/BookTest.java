package task15;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class BookTest {

    @Test
    public void sort(){
        boolean asserted = true;
        List<Book> bookActual = new ArrayList<>();
        bookActual.add(new Book("Book", "Dima", 10,2));
        bookActual.add(new Book("Book2", "Dima2", 14,6));
        bookActual.add(new Book("Book3", "Dima3", 9,4));
        bookActual.add(new Book("Book4", "Dima4", 123,1));
        bookActual.add(new Book("Book5", "Dima5", 13,10));
        Collections.sort(bookActual);
        List<Book> bookExpected = new ArrayList<>();
        bookExpected.add(new Book("Book4", "Dima4", 123,1));
        bookExpected.add(new Book("Book", "Dima", 10,2));
        bookExpected.add(new Book("Book3", "Dima3", 9,4));
        bookExpected.add(new Book("Book2", "Dima2", 14,6));
        bookExpected.add(new Book("Book5", "Dima5", 13,10));
        if (bookExpected.size() != bookActual.size())
            asserted = false;
        if (asserted) {
            for (int i = 0; i < bookExpected.size(); i++){
                if (!bookExpected.get(i).equals(bookActual.get(i))){
                    asserted = false;
                    break;
                }
            }
        }

        Assert.assertEquals(true,asserted);
    }

}