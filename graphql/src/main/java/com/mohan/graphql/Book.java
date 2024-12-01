package com.mohan.graphql;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record Book(Integer id,
                   String name,
                   Integer pageCount,
                   Author author) {

    public static List<Book> books = Arrays.asList(
            new Book(1, "Story Book", 500, Author.authors.getFirst()),
            new Book(2, "Toy", 300, Author.authors.getLast())
    );

    public static Optional<Book> getBookById(int id) {
        return books.stream()
                .filter(book -> book.id.equals(id))
                .findFirst();
    }

    public static Optional<List<Book>> getBookByAuthorId(int id) {
        return Optional.of(books.stream()
                .filter(book -> book.author().id().equals(id))
                .collect(Collectors.toList()));
    }
}
