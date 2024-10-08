package org.example;

import javax.swing.*;

interface LibraryManagementSystem {
    void addBook(Book book);
    void removeBook(String isbn);
    Book findBookByIsbn(String isbn);
    void listAllBooks();

    void listAllBooks(JTextArea outputArea);
}
