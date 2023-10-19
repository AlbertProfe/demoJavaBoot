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
        Book book2 = new Book();

        String author1 = faker.book().author();
        String title1 = faker.book().title();

        String author2 = faker.book().author();
        String title2 = faker.book().title();

        book1.setAuthor(author1);
        book1.setTitle(title1);

        book2.setTitle(title2);
        book2.setAuthor(author2);

        books.add(book1);
        books.add(book2);


        for (int i = 0; i <100 ; i++ ){
            books.add(new Book ( faker.book().title() , faker.number().numberBetween(100, 1250), "Russian",  faker.book().author() ));
            ;       }

    }

    // return books to controller
    // get books form list static from class and return as signature
    public ArrayList<Book> getAllBooks (){
        return books;
    }

    public void deleteAllBooks(){
        books.clear();
        //to-do delete all books with sql
    }


}
