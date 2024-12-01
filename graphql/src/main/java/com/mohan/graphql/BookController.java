package com.mohan.graphql;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class BookController {

    @QueryMapping
    public List<Book> books () {
        return Book.books;
    }

    @QueryMapping
    public Optional<Book> bookById(@Argument int id) {
        return Book.getBookById(id);
    }

    @SchemaMapping
    public Optional<Author> author(Book book) {
        return Author.getAuthorById(book.author().id());
    }

    @QueryMapping
    public Optional<List<Book>> bookByAuthorId(@Argument int id) {
        return Book.getBookByAuthorId(id);
    }
}
