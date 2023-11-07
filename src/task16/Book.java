package task16;

public class Book{
    private final String title;
    private final String author;
    private final int price;
    private static int edition;

    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getPrice(){
        return price;
    }

    public int getEdition() {
        return edition;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null ||this.getClass() != obj.getClass())
            return false;
        Book book = (Book)obj;
        return (this.title == book.title && this.author == book.author && this.price == book.price);
    }


}