package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RestTestExample {

    @Autowired
    BookService bookService;

        @GetMapping("/hellorest")
        public String helloWorld(Model container){

            container.addAttribute("books", bookService.getAllBooks());


            return "Hello Worlds and class!!!!";
        }



}
