package org.example.test2;

import java.util.ArrayList;

public class ViewBookList {

    static void ViewBookList(ArrayList<Book> Book, String LibraryName) {
        System.out.printf("%s-----------------------------\n", LibraryName);
        for (int i = 0; i < Book.size(); i++) {
            System.out.printf("Title: %s Writer: %s \n" , Book.get(i).title, Book.get(i).writer);
        }
    }
}
