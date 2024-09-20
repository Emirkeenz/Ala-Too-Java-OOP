public class Book {
    public String name;
    public String author;
    public float price;
    public int pages;
    public String isbn;

    // default constructor
    public Book(){
        this.name = "";
        this.author = "";
        this.price = 0.0f;
        this.pages = 0;
        this.isbn = "";
    }

    // constructor
    public Book(String name, String author, float price, int pages, String isbn) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.pages = pages;
        this.isbn = isbn;
    }

    // methods
    public void displayInfo() {
        System.out.println("The name of the book: " + name);
        System.out.println("The author of the book: " + author);
        System.out.println("The price of the book: " + price);
        System.out.println("The amount of pages of the book: " + pages);
        System.out.println("The isbn of the book: " + isbn);
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
