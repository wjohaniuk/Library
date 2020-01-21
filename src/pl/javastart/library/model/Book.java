package pl.javastart.library.model;

public class Book {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleseDate() {
        return releseDate;
    }

    public void setReleseDate(int releseDate) {
        this.releseDate = releseDate;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    private String author;
    private int releseDate;
    private int pages;
    private String publisher;
    private String isbn;

    public Book(String title, String author, int releseDate, int pages, String publisher, String isbn) {
        this(title, author, releseDate, pages, publisher);
        this.isbn = isbn;
    }

    public Book(String title, String author, int releseDate, int pages, String publisher) {
        this.title = title;
        this.author = author;
        this.releseDate = releseDate;
        this.pages = pages;
        this.publisher = publisher;
    }

    public void printInfo() {
        System.out.println("Książki dostępne w bibliotece: ");
        String info = title + "; " + author + "; " + releseDate + "; " +
                pages + "; " + publisher ;

        if (isbn != null) {
            info = info + "; " + isbn;
        }
        System.out.println(info);
    }
}
