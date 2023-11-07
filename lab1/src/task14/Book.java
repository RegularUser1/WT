package task14;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public Book clone()
    {
        Book newBook = new Book(this.title, this.author, this.price);
        return newBook;
    }

}
