import java.util.Arrays;
import java.util.Comparator;

public class Book {
    public String name;
    public String author;
    public float price;
    public int pages;
    public String isbn;
    public float rating;

    // default constructor
    public Book(){
        this.name = "";
        this.author = "";
        this.price = 0.0f;
        this.pages = 0;
        this.isbn = "";
        this.rating = 0.0f;
    }

    // constructor
    public Book(String name, String author, float price, int pages, String isbn, float rating) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.pages = pages;
        this.isbn = isbn;
        this.rating = rating;
    }

    // methods
    public void displayInfo() {
        System.out.println("The name of the book: " + name);
        System.out.println("The author of the book: " + author);
        System.out.println("The price of the book: " + price);
        System.out.println("The amount of pages of the book: " + pages);
        System.out.println("The isbn of the book: " + isbn);
        System.out.println("The rating of the book: " + rating);
    }

    public static void bookRating(Book[] books) {
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                // Compare in descending order based on rating
                return Float.compare(b2.rating, b1.rating);
            }
        });

        // After sorting, print the sorted books
        System.out.println("\nBooks sorted by rating (highest to lowest):");
        for (Book book : books) {
            book.displayInfo();
            System.out.println();
        }
    }

    public void applyDiscount(double discount) {
        if (discount > 0 && discount <= 100) {
            double discountAmount = (this.price * discount) / 100;
            this.price -= discountAmount ;
            System.out.println("Discount of " + discount + "% applied. New Price: " + this.price);
        } else {
            System.out.println("Invalid discount percentage.");
        }
    }
}
