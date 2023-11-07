package task16;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task16Test {

    @Test
    public void sortTest1(){
        List<Book> expected = new ArrayList<>();

        expected.add(new Book("Book3", "Dima3", 45));
        expected.add(new Book("Book2", "Dima2", 1));
        expected.add(new Book("Book1", "Dima1", 10));
        expected.add(new Book("Book5", "Dima5", 2));
        expected.add(new Book("Book4", "Dima4", 18));

        Collections.sort(expected, new BookTitleComparator());

        ArrayList<Book> actual = new ArrayList<>();
        actual.add(new Book("Book1", "Dima1", 10));
        actual.add(new Book("Book2", "Dima2", 1));
        actual.add(new Book("Book3", "Dima3", 45));
        actual.add(new Book("Book4", "Dima4", 18));
        actual.add(new Book("Book5", "Dima5", 2));

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void sortTest2(){

        List<Book> expected = new ArrayList<>();

        expected.add(new Book("Book3", "Dima3", 45));
        expected.add(new Book("Book2", "Dima2", 1));
        expected.add(new Book("Book1", "Dima1", 10));
        expected.add(new Book("Book5", "Dima5", 2));
        expected.add(new Book("Book4", "Dima4", 18));

        Collections.sort(expected, new BookAuthorComparator());

        ArrayList<Book> actual = new ArrayList<>();
        actual.add(new Book("Book1", "Dima1", 10));
        actual.add(new Book("Book2", "Dima2", 1));
        actual.add(new Book("Book3", "Dima3", 45));
        actual.add(new Book("Book4", "Dima4", 18));
        actual.add(new Book("Book5", "Dima5", 2));
        Assert.assertEquals(expected,actual);


    }

    @Test
    public void sortTest3(){
        List<Book> expected = new ArrayList<>();

        expected.add(new Book("Book3", "Dima3", 45));
        expected.add(new Book("Book2", "Dima2", 1));
        expected.add(new Book("Book1", "Dima1", 10));
        expected.add(new Book("Book5", "Dima5", 2));
        expected.add(new Book("Book4", "Dima4", 18));

        Collections.sort(expected, new BookPriceComparator());

        ArrayList<Book> actual = new ArrayList<>();
        actual.add(new Book("Book2", "Dima2", 1));
        actual.add(new Book("Book5", "Dima5", 2));
        actual.add(new Book("Book1", "Dima1", 10));
        actual.add(new Book("Book4", "Dima4", 18));
        actual.add(new Book("Book3", "Dima3", 45));

        Assert.assertEquals(expected,actual);


    }
}
