package org.example;

public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();

        Novel novel1 = new Novel("Alexandru Lapusneanu", 127, "Istoric");
        Novel novel2 = new Novel("Moara cu noroc", 143, "Degradare umana");
        Novel novel3= new Novel("Pacat",183,"Religie");
        Novel novel4=new Novel ("Întâlnirea din pământuri",456, "Conflict");
        Album album1 = new Album("War", 120, "Low");
        Album album2 = new Album("Mona Lisa", 80, "High");

        catalog.addBook(novel1);
        catalog.addBook(novel2);
        catalog.addBook(novel3);
        catalog.addBook(novel4);
        catalog.addBook(album1);
        catalog.addBook(album2);
        catalog.deleteBook(novel2);
        catalog.listBooks();


    }
}
