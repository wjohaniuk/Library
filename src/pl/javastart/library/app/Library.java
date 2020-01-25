package pl.javastart.library.app;

import pl.javastart.library.io.DataReader;
import pl.javastart.library.model.Book;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.8";
        Scanner scanner = new Scanner(System.in);

        Book[] books = new Book[1000];
        DataReader dataReader = new DataReader();
        books[0] = dataReader.readAndCreateBook();
        books[1] = dataReader.readAndCreateBook();
        dataReader.close();




        System.out.println(appName);
        books[0].printInfo();
        books[1].printInfo();

    }
}
