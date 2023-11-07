package task12;

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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null ||this.getClass() != obj.getClass())
            return false;
        Book book = (Book)obj;
        return (this.title == book.title && this.author == book.author && this.price == book.price);
    }

    @Override
    public String toString() {
        return "title: "+this.title + " author: " + this.author + " price: " + this.price + " edition " + this.edition;
    }

    @Override
    public int hashCode() {
        int Result = this.title == null ? 0 : this.title.hashCode();
        Result += this.author == null ? 0 : this.author.hashCode();
        Result = 41*Result+this.price;
        Result += 41*Result+edition;
        return Result;
    }
}
