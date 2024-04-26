package OOP.start_package;

import java.util.Scanner;
import Basis.Methods.Sum; //таким способом можно импортировать свои пакеты (и соотв-но все классы, методы и переменные)


public class Runner {
    public static void main(String[] args) {
        //пример результата импорта пакета
        Sum sum = new Sum();
        int num1 = sum.a + 1;
        int num2 = sum.a + 5;
        System.out.println(sum.sum2Nums(num1, num2));

        java.util.Date utilDate = new java.util.Date(); //если у классов из разных пакетов одинаковые имена
        java.sql.Date sqlDate = new java.sql.Date(1);   //то нужно указывать полный путь

        //классы - введение
        System.out.println();
        Scanner scan = new Scanner(System.in);
        String user1Login;
        int user1Password;
        try {
            System.out.print("Введите логин: ");
            user1Login = scan.next();
            System.out.print("Введите пароль: ");
            user1Password= scan.nextInt();
            User user1 = new User(user1Login, user1Password);
            user1.infoAboutUser();
        }catch (Exception e){
            System.out.println("Ошибка: " + e.getMessage() + "\nВведите корректные данные!");
        }
    }
}
