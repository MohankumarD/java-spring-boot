package com.explore.response_wrapper.record;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Book(Integer id,
                   String authorName,
                   Integer pageCount) {

    public static List<Book> books = Arrays.asList(
            new Book(1, "Mohan", 350),
            new Book(2, "Kumar", 550)
    );

    public static Optional<Book> getBookById(Integer bookId) {
        return books.stream()
                .filter(book -> book.id.equals(bookId))
                .findFirst();
    }
}
