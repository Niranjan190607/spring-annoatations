package net.javathecode.spring_annotaations.controller;

import net.javathecode.spring_annotaations.beans.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/api")
public class BookController {

    @RequestMapping("/hello-world")

    public String helloWorld() {
        return "Hello World!..";
    }

    @RequestMapping(value = {"/book", "/core-java", "/java"},
            method = RequestMethod.GET,

            consumes = {MediaType.APPLICATION_JSON_VALUE})
    //@ResponseBody
    public Book getBook() {
        Book book = new Book(1, "Java", "Learn Java tutorial");
        return book;
    }

    @PostMapping(value = "book/save-book",
            consumes = {MediaType.APPLICATION_JSON_VALUE})
    //@ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<Book> saveBook(@RequestBody Book book) {
        System.out.println(book.getId());
        System.out.println(book.getTitle());
        System.out.println(book.getDescription());
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }

    @PutMapping(value = "book/update/{id}")
    public ResponseEntity<Book> update(@PathVariable int id, @RequestBody Book updateBook) {
        System.out.println(id);
        System.out.println(updateBook.getTitle());
        System.out.println(updateBook.getDescription());
        updateBook.setId(id);
        return ResponseEntity.ok(updateBook);
    }

    @GetMapping(value = "book/getBooks/{id}/{title}/{description}")
    public ResponseEntity<Book> getBooks(@PathVariable int id,
                                         @PathVariable("title") String bookTitle,
                                         @PathVariable("description") String bookDescription) {
        System.out.println(id);
        System.out.println(bookTitle);
        System.out.println(bookDescription);
        Book book = new Book();
        book.setId(id);
        book.setTitle(bookTitle);
        book.setDescription(bookDescription);
        return ResponseEntity.ok(book);
    }

    @GetMapping("/book/query")
    public ResponseEntity<Book> requestparamDemo(
            @RequestParam(name = "id") int id,
            @RequestParam(name = "title") String title,
            @RequestParam(name = "description") String description) {

        Book book = new Book();

        book.setId(id);
        book.setTitle(title);
        book.setDescription(description);

        return ResponseEntity.ok(book);
    }

}
