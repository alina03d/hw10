import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int year;

    public Book(String title, Author author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public String getTitle(){
        return title;
    }
    public Author getAuthor(){
        return author;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }

    @Override
    public String toString() {
        return "Книга \"" + title + "\", год издания: " + year + ", автор: " + author;
    }

    @Override
    public int hashCode(){
        return Objects.hash(title, year, author);
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Book book = (Book) o;
        return Objects.equals(title, book.getTitle())&&
                Objects.equals(year, book.getYear())&&
                Objects.equals(author, book.getAuthor());
    }


}
