package com.explore.response_wrapper.controller;

import com.explore.response_wrapper.record.Book;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ResponseController {

    @RequestMapping("/name")
    public String getName(){
        return "Mohankumar D";
    }

    @RequestMapping("/book/{bookId}")
    public Optional<Book> getBook(@PathVariable Integer bookId){
        return Book.getBookById(bookId);
    }
}
