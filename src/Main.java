public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Александр", "Пушкин");
        Author author2 = new Author("Александр", "Грин");

        Book book1 = new Book("Евгений Онегин", author1, 1831);
        Book book2 = new Book("Алые паруса", author2, 1922);

        System.out.println(book1.getTitle() + " " + book1.getYear() + " " + book1.getAuthor().getName() + " " + book1.getAuthor().getSurname());
        System.out.println(book2.getTitle() + " " + book2.getYear() + " " + book2.getAuthor().getName() + " " + book2.getAuthor().getSurname());

        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());

        System.out.println(author1.equals(author2));
        System.out.println(author2.equals(author1));

        System.out.println(author1);
        System.out.println(author2);

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());

        System.out.println(book1.equals(book2));
        System.out.println(book2.equals(book1));

        System.out.println(book1);
        System.out.println(book2);

    }
}