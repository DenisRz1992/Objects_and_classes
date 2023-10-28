
public class Main {
    public static void main(String[] args) {
        System.out.println("Objects and classes");
        System.out.println("level easy");
        Author stepenKing = new Author("Stephen", "King");
        Author stepenKing2 = new Author("Stephen", "King");
        System.out.println(stepenKing2.equals(stepenKing));
        Book firstBook = new Book("Desperation", stepenKing, 1997);
        System.out.println(firstBook.getBookName() + " " + firstBook.getPublishYear() + " " + firstBook.getAuthor().getName() + " " + firstBook.getAuthor().getSurName());
        System.out.println(firstBook);
        Book secondBook = new Book("5 love languages", new Author("Harry", "Chepman"), 1992);
        firstBook.setPublishYear(2020);
        System.out.println(firstBook.getPublishYear());
    }
}