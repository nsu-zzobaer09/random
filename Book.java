class Book {
    // Private variables for encapsulation
    private String author;
    private String bookName;
    private String isbn;
    private double price;

    // Constructor
    public Book(String author, String bookName, String isbn, double price) {
        this.author = author;
        this.bookName = bookName;
        this.isbn = isbn;
        this.price = price;
    }

    // Getters
    public String getAuthor() {
        return author;
    }

    public String getBookName() {
        return bookName;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }

    // Display method
    public void displayBook() {
        System.out.println("Author: " + author);
        System.out.println("Book Name: " + bookName);
        System.out.println("ISBN: " + isbn);
        System.out.println("Price: $" + price);
        System.out.println();
    }

    public static void main(String[] args) {

        // 1. Array of 5 Book objects
        Book[] books = {
            new Book("J.K. Rowling", "Harry Potter", "9780747532743", 29.99),
            new Book("George Orwell", "1984", "2222", 20.00),
            new Book("J.R.R. Tolkien", "The Hobbit", "3333", 25.75),
            new Book("Dan Brown", "Inferno", "4444", 35.00),
            new Book("Paulo Coelho", "The Alchemist", "5555", 18.50)
        };

        // 2. Display all books
        System.out.println("Book List:");
        System.out.println("-----------------");
        for (int i = 0; i < books.length; i++) {
            books[i].displayBook();
        }

        // 3. Calculate total price
        double total = 0;
        for (int i = 0; i < books.length; i++) {
            total += books[i].getPrice();
        }
        System.out.println("Total Price = $" + total);

        // 4. Find the highest-priced book
        Book highest = books[0];

        for (int i = 1; i < books.length; i++) {
            if (books[i].getPrice() > highest.getPrice()) {
                highest = books[i]; // Store the entire Book object, not just the price
            }
        }

        System.out.println("\n-----------------");
        System.out.println("Highest Priced Book:");
        highest.displayBook();
    }
}