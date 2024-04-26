package Basis.tasks.LibraryReaders;

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

import java.lang.reflect.Array;
import java.util.*;

public class Runner {
    public static void main(String[] args) {
//        Reader reader1 = new Reader("Белев Д.Д.", 1001, "11.03.2011", "+79258884465");
//        Reader reader2 = new Reader("Белев Б.Д.", 1002, "23.05.2002", "+79258114433");
//
//        Book book1 = new Book("Остров Сокровищ", "Роберт Стивенсон");
//        Book book2 = new Book("Тёмный карнавал", "Рэй Брэдбери");
//        Book book3 = new Book("Мёртвая зона", "Стивен Кинг");
//
//        reader1.takeBook(2);
//        reader1.takeBook("Остров Сокровищ", "Машина Времени");
//        reader1.takeBook(book1, book2);
//
//        reader2.takeBook(book3, book2);
//        reader2.returnBook(book2, book3);

// решение задачи сверху (не сработает: удалил libraryCardNum из конструктора)



        Scanner scanner = new Scanner(System.in);
        List<Reader> listOfReaders = new ArrayList<>();     //содержит в себе всех читателей
        List<Book> listOfBooks = new ArrayList<>();     //содержит в себе все книги

        Menu mainMenu = new Menu(                           //создаем главное меню, перечисляя все пункты
                "1. Добавить нового читателя.",
                "2. Удалить читателя.",
                "3. Добавить новую книгу.",
                "4. Удалить книгу.",
                "5. Читатель принёс книгу.",
                "6. Читатель взял книгу.",
                "7. Вывести список всех читателей."
            );
/*
В будущем можно сделать возможность редактировать пункты меню:
    Привязать номер пункта к индексу массива
*/
        mainMenu.showMenu();
        System.out.print("Выберите действие: ");
        int userSelection = scanner.nextInt();

        if (userSelection == 1){    //добавляем нового читателя
            System.out.print("Введите ФИО читателя: ");
            scanner.nextLine();
            String fullName = scanner.nextLine();
            System.out.print("Введите дату рождения: ");
            String dateOfBirth = scanner.next();
            System.out.print("Введите номер телефона читателя: ");
            String phoneNum = scanner.next();

            Reader reader = new Reader(fullName, dateOfBirth, phoneNum);
            listOfReaders.add(reader);
            reader.infoReader();
        } else if (userSelection == 7) {    //выводим список всех читателей
            for (Reader reader : listOfReaders){
                reader.infoReader();
                System.out.println();
            }
        }
    }
}
