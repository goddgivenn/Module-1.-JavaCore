package Basis.if_else;

public class Runner {
    public static void main(String[] args) {
        /*
        * Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
        * Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
        * */

        /*
        * Math.random() - вывод рандомного нецелого числа от 0 до 1 - диапазон по умолчанию: [0, 1]
        * для корректировки диапазона проводим стандартные математические операции
        *
        * Math.abs(n) - возвращает положительное число
        *
        * Шаг №1: Диапазон [0;1) умножается на 20. Соответственно,

            Нижняя граница: 0*20 = 0
            Верхняя граница: 1*20 = 20

            Получаем диапазон [0;20)

            Шаг №2: К диапазону [0;20) прибавляем 1. Соответственно,

            Нижняя граница: 0 + 1  = 1
            Верхняя граница: 20 + 1 = 21

            Получаем диапазон [1;21)
        * */


        int min = 1;
        int max = 20;
        int numTarget = 10;
        int m = (int) (min + Math.random() * max);
        int n = (int) (min + Math.random() * max);
        System.out.println(m + ", " + n);

        int res_m = (numTarget - m);
        int res_n = (numTarget - n);

        if (res_m < 0){
            res_m *=-1;
        }
        if (res_n < 0){
            res_n *=-1;
        }

        System.out.println(res_n);
        System.out.println(res_m);

        if(res_m < res_n){
            System.out.println("Результат:" + m);
        }else if(res_m > res_n) {
            System.out.println("Результат:" + n);
        }else {
            System.out.println("Числа равноудалены");
        }


        //-------------

        int x=3;
        int y=2;
        int z = x<y? (x+y) : (x-y); //тернарный оператор
        System.out.println(z);

    }
}
