public class Main {
    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem(10);

        // Adding books
        library.addBook(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book(2, "To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book(3, "1984", "George Orwell"));

        // Linear search
        System.out.println("Linear Search:");
        Book book = library.linearSearchByTitle("1984");
        System.out.println(book != null ? book : "Book not found");

        // Sort books for binary search
        library.sortBooksByTitle();

        // Binary search
        System.out.println("Binary Search:");
        book = library.binarySearchByTitle("1984");
        System.out.println(book != null ? book : "Book not found");
    }
}
