package Basis.tasks.LibraryReaders;

import java.util.ArrayList;
import java.util.List;

/*
    Определить класс Reader, хранящий такую информацию о пользователе библиотеки:

    ФИО,
    номер читательского билета,
    факультет,
    дата рождения,
    телефон.
    Методы takeBook(), returnBook().
    Разработать программу, в которой создается массив объектов данного класса.
    Перегрузить методы takeBook(), returnBook():
    - takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
    - takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
    - takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
     Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия". Или  "Петров В. В. вернул 3 книги".
*/
public class Reader {
    private String fullName;
    private static int libraryCardNum = 1000;
    private String dateOfBirth;
    private String phoneNum;

    public Reader(String fullName, String dateOfBirth, String phoneNum) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNum = phoneNum;
        libraryCardNum++;
    }

    public void takeBook (int numOfBooks){
        System.out.printf("%s взял %d книги\n", fullName, numOfBooks);
    }
    public void takeBook (String ...nameOfBook){
        String stringListOfBooks = String.join(", ", nameOfBook);
        System.out.printf("%s взял книги: %s\n", fullName, stringListOfBooks);
    }
    public void takeBook (Book ...books){
        List<String> listOfBooks = new ArrayList<>();
        for (Book book : books){
            listOfBooks.add(book.infoAboutBook());
        }
        String stringListOfBooks = String.join(", ", listOfBooks);
        System.out.printf("%s взял книги: %s\n", fullName, stringListOfBooks);
    }

    public void returnBook (int numOfBooks){
        System.out.printf("%s вернул %d книги\n", fullName, numOfBooks);
    }
    public void returnBook (String ...nameOfBook){
        String stringListOfBooks = String.join(", ", nameOfBook);
        System.out.printf("%s вернул книги: %s\n", fullName, stringListOfBooks);
    }
    public void returnBook (Book ...books){
        List<String> listOfBooks = new ArrayList<>();
        for (Book book : books){
            listOfBooks.add(book.infoAboutBook());
        }
        String stringListOfBooks = String.join(", ", listOfBooks);
        System.out.printf("%s вернул книги: %s\n", fullName, stringListOfBooks);
    }
    public void infoReader(){
        System.out.printf("\nФИО читателя: %s\n", fullName);
        System.out.printf("Номер читательского билета: %d\n", libraryCardNum);
        System.out.printf("Дата рождения читателя: %s\n", dateOfBirth);
        System.out.printf("Номер телефона читателя: %s\n", phoneNum);
    }
}
