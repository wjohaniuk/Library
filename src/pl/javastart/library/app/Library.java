package pl.javastart.library.app;

import pl.javastart.library.model.Book;

public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.7";

        Book[] books = new Book[1000];

        books[0] = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 2010,
                296, "Greg", "987456123");
        books[1] = new Book("Java dla początkujących", "Joshua Bloch", 2013,
                496, "Helion", "32156489");
        books[2] = new Book("Sun Certified Programmer for Java", "Bert Bates", 2008,
                896, "McGraw-Hill");

        System.out.println(appName);
        books[0].printInfo();
        books[1].printInfo();
        books[2].printInfo();

    }
}
