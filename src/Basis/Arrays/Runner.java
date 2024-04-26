package Basis.Arrays;
import java.util.*;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        /*
        * Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку.
        * Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.
        * Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
        * */

        int[] randomNums = new int[11];
        int[] randomNumsCopy = new int[11];

        List<Integer> listMinus1 = new ArrayList<>();
        List<Integer> list0 = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = (int)(Math.random() * 4 - 2);
            randomNumsCopy[i] = randomNums[i];
        }
        System.out.println(Arrays.toString(randomNums) + "\n" + Arrays.toString(randomNumsCopy));

        for (int i = 0; i < randomNums.length; i++) {
            for (int j = 0; j < randomNumsCopy.length; j++) {
                if (randomNums[i] == randomNumsCopy[j] && randomNums[i] == -1) {
                    listMinus1.add(randomNums[i]);
                    break;
                }else if (randomNums[i] == randomNums[j] && randomNums[i] == 0) {
                    list0.add(randomNums[i]);
                    break;
                }else if (randomNums[i] == randomNums[j] && randomNums[i] == 1) {
                    list1.add(randomNums[i]);
                    break;
                }
            }
        }

        System.out.println("\n" + listMinus1);
        System.out.println(list0);
        System.out.println(list1);

        if(listMinus1.size() > list0.size() && listMinus1.size() > list1.size()){
            System.out.println("'-1' повторяется чаще");
        }
        if(list0.size() > listMinus1.size() && list0.size() > list1.size()){
            System.out.println("'0' повторяется чаще");
        }
        if(list1.size() > list0.size() && list1.size() > listMinus1.size()){
            System.out.println("'1' повторяется чаще");
        }

    }
}
