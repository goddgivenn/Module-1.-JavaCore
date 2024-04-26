package Basis.Methods;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        int result1 = Sum.sum2Nums(2, 3);
        int result2 = sum2Nums_var2(12, 3);
        int result3 = sum2Nums_var2(12, 3, 14); //перегрузка метода

        System.out.println(result1 + ", " + result2 + ", " + result3);

        hello();

        sum(1,2,3);
        sum(5, 1, 7,1,1213);

        List<Integer> numsForSumCollection = new ArrayList<>();
        int num1 = 10;
        int num2 = 1;
        int num3 = 14;
        numsForSumCollection.add(num1);
        numsForSumCollection.add(num2);
        numsForSumCollection.add(num3);

        sumCollection(numsForSumCollection);
    }

    public static int sum2Nums_var2(int a, int b){ //второй вариант создания метода
        return a + b;
    }
    public static int sum2Nums_var2(int a, int b, int c){ //перегрузка метода - использование метода с одинаковым именем, но с разными аргументами
        return a + b + c;
    }
    static void hello(){                           //метод без возвращаемого значения
        System.out.println("Hello, World!\n");
    }
    static void sum(int ...nums){                  //метод с необязательным параметром (принимает множество аргументов) - сумма чисел
        List<Integer> listNums = new ArrayList<>();

        int res = 0;
        int countNums = 0;
        for (int x : nums){
            listNums.add(x);
            res+=x;
        }
        for (Integer listNum : listNums) {
            countNums++;
            if (countNums < listNums.size()){
                System.out.print(listNum + " + ");
            }else {
                System.out.print(listNum);
            }
        }

        System.out.print(" = " + res + "\n");
    }
    static void sumCollection (List<Integer> nums){ //то же самое, но тип данных - коллекция (чтобы числа принимать не в аргументы (руками), а в коллекцию
        List<Integer> listNums = new ArrayList<>();

        int res = 0;
        int countNums = 0;
        for (int x : nums){
            listNums.add(x);
            res+=x;
        }
        for (Integer listNum : listNums) {
            countNums++;
            if (countNums < listNums.size()){
                System.out.print(listNum + " + ");
            }else {
                System.out.print(listNum);
            }
        }

        System.out.print(" = " + res + "\n");
    }

}
