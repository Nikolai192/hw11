public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Александр", "Пушкин");
        Book book1 = new Book("Евгений Онегин", author1, 2010);
        System.out.println("Автор книги - " + book1.getAuthor().getNameAuthor() + " " + book1.getAuthor().getFamilyAuthor());
        System.out.println("Название книги - " + book1.getTitle());
        book1.setPublishingYear(2015);
        System.out.println("Год публикации - " + book1.getPublishingYear());

    }
}