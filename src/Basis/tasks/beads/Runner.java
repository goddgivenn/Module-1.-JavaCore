package Basis.tasks.beads;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws IOException {
        /*
        В шкатулке хранится разноцветный бисер (или бусины). Все бусины имеют одинаковую форму, размер и вес.
        Бусины могут быть одного из N различных цветов. В шкатулке много бусин каждого цвета.

        Требуется определить минимальное число бусин, которые можно не глядя вытащить из шкатулки так, чтобы среди них гарантированно были две бусины одного цвета.
        Формат ввода

        Входной файл input.txt содержит одно натуральное число N - количество цветов бусин (1 ≤ N ≤ 1000000000).
        Формат вывода
        В выходной файл output.txt выведите ответ на поставленную задачу.
        */

        Scanner scan = new Scanner(System.in);
        int countColors = scan.nextInt();
        try(FileWriter inCountColors = new FileWriter("E:\\Programming\\Self-study\\Module 1. JavaCore\\src\\Basis.tasks\\beads\\input.txt", true)){
            inCountColors.write(countColors);
        }

        scan.close();

    }
}
