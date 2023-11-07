package task13;

import  task12.Book;

public class ProgrammerBook extends Book{
    private String language;
    private int level;

    public ProgrammerBook(String language, int level,String title, String author, int price) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null ||this.getClass() != obj.getClass())
            return false;
        ProgrammerBook book = (ProgrammerBook)obj;
        if (!super.equals(book))
            return false;
        return (this.language == book.language && this.level== book.level);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + 41*level + 41*language.hashCode();
    }

    @Override
    public String toString() {
        return super.toString() + " language: " + language + " level: " + level;
    }
}
