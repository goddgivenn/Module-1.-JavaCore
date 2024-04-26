package Basis.Methods.recursion;

/*
    Рекурсивная функция - вызывает саму себя
*/

public class Runner {
    public static void main(String[] args) {
//        recursionFucn();

        int result = printInfo(15);
        System.out.println(result);

    }
//    public static void recursionFucn() {              //метод вызывает сам себя - вывод текста - вызов метода - вывод текста - вызов метода и т.д бесконечно, пока не закончится память
//        System.out.println("Привет, JavaRush!");
//        recursionFucn();
//    }

    public static int printInfo(int num){ //вывод всех чисел от num до 0
        if (num <= 0) {
            return 0;
        }
        System.out.print(num + " ");
        return printInfo(num-1);
    }
}
