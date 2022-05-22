public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Александр", "Пушкин");
        Author author2 = new Author("Александр", "Грин");

        Book book1 = new Book("Евгений Онегин", author1, 1831);
        Book book2 = new Book("Алые паруса", author2, 1922);

        System.out.println(book1.getTitle() + " " + book1.getYear() + " " + book1.getAuthor().getName() + " " + book1.getAuthor().getSurname());
        System.out.println(book2.getTitle() + " " + book2.getYear() + " " + book2.getAuthor().getName() + " " + book2.getAuthor().getSurname());

        book1.setYear(1833);
        System.out.println(book1.getTitle() + " " + book1.getYear() + " " + book1.getAuthor().getName() + " " + book1.getAuthor().getSurname());
    }
}