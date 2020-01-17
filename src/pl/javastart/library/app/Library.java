package pl.javastart.library.app;

import pl.javastart.library.model.Book;

public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.5";

        Book book1 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 2010,
                296, "Greg", "987456123");
        Book book2 = new Book("Java dla początkujących", "Joshua Bloch", 2013,
                496, "Helion", "32156489");
        Book book3 = new Book("Sun Certified Programmer for Java", "Bert Bates", 2008,
                896, "McGraw-Hill");

        System.out.println(appName);
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();

    }
}
