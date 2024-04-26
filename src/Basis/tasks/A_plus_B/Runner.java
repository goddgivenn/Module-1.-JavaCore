package Basis.tasks.A_plus_B;

import java.io.*;


public class Runner {
    public static void main(String[] args) throws IOException {
        /*
Требуется сложить два целых числа А и В.
Формат ввода

В единственной строке входного файла input.txt записаны два натуральных числа через пробел. Значения чисел не превышают 109.
Формат вывода
В единственную строку выходного файла output.txt нужно вывести одно целое число — сумму чисел А и В.
        */

        int a = 13;
        int b = 7;
        String fileNameInput = "E:\\Programming\\Self-study\\Module 1. JavaCore\\src\\Basis.tasks\\A_plus_B\\input.txt";
        String fileNameOutput = "E:\\Programming\\Self-study\\Module 1. JavaCore\\src\\Basis.tasks\\A_plus_B\\output.txt";

        try(FileWriter inputFile = new FileWriter(fileNameInput)){
            inputFile.write(a + " " + b);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        FileReader readerInputFile = new FileReader(fileNameInput);
        StringBuilder stringBuilder = new StringBuilder();
        while (readerInputFile.ready()){
            stringBuilder.append((char)readerInputFile.read());
            System.out.println(stringBuilder);
        }
        System.out.println(stringBuilder);
    }
}
