package pl.javastart.library.io;

import pl.javastart.library.model.Book;

import java.util.Scanner;

public class DataReader {
    private Scanner scanner = new Scanner(System.in);



   public Book readAndCreateBook() {
        System.out.println("Podaj tytuł: ");
        String title = scanner.nextLine();
        System.out.println("Podaj Autora: ");
        String author = scanner.nextLine();
        System.out.println("Podaj wydawnictwo: ");
        String publisher = scanner.nextLine();
        System.out.println("ISBN: ");
        String isbn = scanner.nextLine();
        System.out.println("Rok wydania: ");
        int relaseDate = scanner.nextInt();
        System.out.println("Liczba stron: ");
        int pages = scanner.nextInt();
        scanner.nextLine();
        return  new Book(title, author, relaseDate, pages, publisher, isbn);
    }
    public void close(){
       scanner.close();
    }
}
