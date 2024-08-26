@GetMapping("/{id}")
public ResponseEntity<Book> getBookById(@PathVariable Long id) {
    for (Book book : books) {
        if (book.getId().equals(id)) {
            return new ResponseEntity<>(book, HttpStatus.OK);
        }
    }
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
}

@GetMapping("/search")
public ResponseEntity<List<Book>> searchBooks(@RequestParam(required = false) String title,
                                              @RequestParam(required = false) String author) {
    List<Book> filteredBooks = new ArrayList<>();
    for (Book book : books) {
        if ((title == null || book.getTitle().equalsIgnoreCase(title)) &&
            (author == null || book.getAuthor().equalsIgnoreCase(author))) {
            filteredBooks.add(book);
        }
    }
    return new ResponseEntity<>(filteredBooks, HttpStatus.OK);
}
