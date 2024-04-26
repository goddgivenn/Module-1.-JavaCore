package Basis.tasks.LibraryReaders;

import java.util.ArrayList;

public class Book {
    private String nameOfBook;
    private String author;

    public Book(String nameOfBook, String author) {
        this.nameOfBook = nameOfBook;
        this.author = author;
    }
    public String infoAboutBook(){
        ArrayList<String> nameAndAuthor = new ArrayList<>();
        nameAndAuthor.add(nameOfBook);
        nameAndAuthor.add(author);
        String stringNameAndAuthors = String.join(" - ", nameAndAuthor);
        return stringNameAndAuthors;
    }
}
