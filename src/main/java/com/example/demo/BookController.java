package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import org.springframework.ui.Model;
@Controller
public class BookController {

    @RequestMapping("/books")
    public String BookHome (Model booksContainer){

        //manage request and call template th to create render
        // using BOOK  entity object BOOK

        Book mybook1 = new Book("Anna K1", 1565, "Russian", "Tolstoi");
        Book mybook2 = new Book("Anna K2", 1565, "Russian", "Tolstoi");
        Book mybook3 = new Book("Anna K3", 1565, "Russian", "Tolstoi");
        Book mybook4 = new Book("Anna K4", 1565, "Russian", "Tolstoi");

        ArrayList<Book> books = new ArrayList<>();
        books.add(mybook1);
        books.add(mybook2);
        books.add(mybook3);
        books.add(mybook4);

        booksContainer.addAttribute("booksToTH", books);


         return "books.html";
    }
}
