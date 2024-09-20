public class Main {
    public static void main(String[] args) {
        // Creating book objects using default and parameterized constructors
        Book book1 = new Book();  // Default constructor
        Book book2 = new Book("Poplar in a red scarf", "Chyngyz Aitmatov", 580.99f, 544, "978-5-699-14043-5");  // Parameterized constructor
        Book book3 = new Book("Dead souls", "Nikolai Vasilyevich Gogol", 600.00f, 464, "978-5-9925-1253-3");

        // Displaying book information
        System.out.println("Book 1:");
        book1.displayInfo();

        System.out.println("\nBook 2:");
        book2.displayInfo();

        System.out.println("\nBook 3:");
        book3.displayInfo();

        // Applying discount to a book
        System.out.println("\nApplying discount to Book 2:");
        book2.applyDiscount(15);
    }
}
