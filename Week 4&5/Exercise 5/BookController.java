@PostMapping
@ResponseStatus(HttpStatus.CREATED)
public ResponseEntity<Book> createBook(@RequestBody Book book) {
    books.add(book);
    return ResponseEntity.status(HttpStatus.CREATED)
            .header("Custom-Header", "Book Created")
            .body(book);
}

@PutMapping("/{id}")
@ResponseStatus(HttpStatus.OK)
public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
    for (Book book : books) {
        if (book.getId().equals(id)) {
            book.setTitle(updatedBook.getTitle());
            book.setAuthor(updatedBook.getAuthor());
            book.setPrice(updatedBook.getPrice());
            book.setIsbn(updatedBook.getIsbn());
            return ResponseEntity.ok()
                    .header("Custom-Header", "Book Updated")
                    .body(book);
        }
    }
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
}
