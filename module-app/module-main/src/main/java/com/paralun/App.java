package com.paralun;

import com.paralun.model.Book;

public class App {
    public static void main(String[] args) {
        Book book = new Book();
        book.setId("123");
        book.setJudul("Belajar Maven");
        book.setPenulis("James Kusmambang");
        book.setPenerbit("CV. Purnama Book");

        System.out.println(book);
    }
}
