public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();  // Default constructor
        Book book2 = new Book("Poplar in a red scarf", "Chyngyz Aitmatov", 580.99f, 544, "978-5-699-14043-5", 4.9f);
        Book book3 = new Book("Dead souls", "Nikolai Vasilyevich Gogol", 600.00f, 464, "978-5-9925-1253-3", 4.5f);
        Book book4 = new Book("War and Peace", "Leo Tolstoy", 750.50f, 1225, "978-3-16-148410-0", 4.8f);
        Book book5 = new Book("Crime and Punishment", "Fyodor Dostoevsky", 500.99f, 671, "978-0-14-305814-4", 4.7f);
        Book book6 = new Book("Moby-Dick", "Herman Melville", 450.00f, 635, "978-0-14-243724-7", 4.2f);
        Book book7 = new Book("The Brothers Karamazov", "Fyodor Dostoevsky", 640.75f, 796, "978-0-14-044924-2", 4.9f);


        Book[] books = {book1, book2, book3, book4, book5, book6, book7};

        System.out.println("Books before sorting:");
        for (Book book : books) {
            book.displayInfo();
            System.out.println();
        }

        Book.bookRating(books);

        System.out.println("\nApplying discount to Book 2:");
        book2.applyDiscount(15);
    }
}
