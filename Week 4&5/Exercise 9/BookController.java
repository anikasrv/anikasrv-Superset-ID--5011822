public class BookController {
    package com.example.BookstoreAPI.controller;

import com.example.BookstoreAPI.dto.BookDTO;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@RestController
@RequestMapping("/books")
public class BookController {

    private List<BookDTO> books = new ArrayList<>();

    @GetMapping("/{id}")
    public ResponseEntity<EntityModel<BookDTO>> getBookById(@PathVariable Long id) {
        for (BookDTO book : books) {
            if (book.getId().equals(id)) {
                EntityModel<BookDTO> resource = EntityModel.of(book);
                Link selfLink = linkTo(methodOn(BookController.class).getBookById(id)).withSelfRel();
                Link allBooksLink = linkTo(methodOn(BookController.class).getAllBooks()).withRel("all-books");
                resource.add(selfLink, allBooksLink);
                return new ResponseEntity<>(resource, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping
    public ResponseEntity<List<EntityModel<BookDTO>>> getAllBooks() {
        List<EntityModel<BookDTO>> resources = new ArrayList<>();
        for (BookDTO book : books) {
            EntityModel<BookDTO> resource = EntityModel.of(book);
            Link selfLink = linkTo(methodOn(BookController.class).getBookById(book.getId())).withSelfRel();
            resource.add(selfLink);
            resources.add(resource);
        }
        return new ResponseEntity<>(resources, HttpStatus.OK);
    }
}

}
