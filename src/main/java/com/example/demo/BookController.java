package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import org.springframework.ui.Model;



@Controller
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping("/books")
    public String BookHome (Model booksContainer){

        //bookService.deleteAllBooks();

        booksContainer.addAttribute("booksToTH",  bookService.getAllBooks() );

        return "books.html";
    }
}
