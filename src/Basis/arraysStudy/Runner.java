package Basis.arraysStudy;

public class Runner {
    public static void main(String[] args) {
        int[][] numsArray = {{5, 2, 100, 3, 2, 2}, {4, 2, 3, 3, 2, 100}};

        int lastElement = numsArray[numsArray.length-1][numsArray[1].length-1]; //узнаем последний элемент двумерного массива
        System.out.println("lastElement: " + lastElement);

        int numElement = 1;
        for (int el = 0; el < numsArray.length; el++) {                             //перебираю 2-ный массив и делаю так, чтобы в конце была точка, а не запятая
            for (int i = 0; i < numsArray[el].length; i++) {
                if(el == numsArray.length-1 && i == numsArray[el].length-1){
                    System.out.println(numElement + ") " + numsArray[el][i] + ".");
                }else {
                    System.out.println(numElement + ") " + numsArray[el][i] + ", ");
                }
                numElement++;
            }
        }

    }
}
