package org.example;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private final List<Book> books;

    public Catalog() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void deleteBook(Book book) {
        books.remove(book);
    }

    public void listBooks() {
        for (Book book : books) {
            System.out.println(book.getName());
        }
    }


}