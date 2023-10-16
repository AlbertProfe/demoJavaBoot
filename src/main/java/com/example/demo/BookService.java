package com.example.demo;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class BookService {

    static ArrayList<Book> books = new ArrayList<>();

    static {

        Faker faker = new Faker();
        Book book1 = new Book();

        String author1 = faker.book().author();
        String title1 = faker.book().title();

        book1.setAuthor(author1);
        book1.setTitle(title1);

        books.add(book1);

    }


    public ArrayList<Book> getAllBooks (){
        return books;
    }

    public void deleteAllBooks(){
        books.clear();
        //to-do delete all books with sql
    }


}
