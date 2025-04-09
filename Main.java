import src.Library;
import src.Book;
import src.Patron;

public class Main {    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Titulo1", "Autor1");

        library.addBook(book1);

        // imprimir los libros de la libreria
        System.out.println("Libros:");
        for (Book book : library.listAvailableBooks()) {
            System.out.println(book.getTitle() + " - " + book.getAuthor());
        }
    }
}