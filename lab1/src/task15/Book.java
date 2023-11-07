package task15;


public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private int isbn;
    private static int edition;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null ||this.getClass() != obj.getClass())
            return false;
        Book book = (Book)obj;
        return (this.title == book.title && this.author == book.author && this.price == book.price && this.isbn == book.isbn);
    }
    public Book(String title, String author, int price, int isbn){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    @Override
    public int compareTo(Book o) {
        if (this.isbn > o.isbn)
            return 1;
        else if (this.isbn < o.isbn)
            return -1;
        else
            return 0;
    }
}
