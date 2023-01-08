package org.example;

public class Novel extends Book {
    private final String genre;

    public Novel(String name, int pages, String genre) {
        super(name, pages);
        this.genre = genre;
    }

}
