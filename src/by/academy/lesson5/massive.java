package by.academy.lesson5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class massive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int enter = sc.nextInt();
        int[] mas = new int[10];
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(10);
        }
        System.out.println("Массив: " + Arrays.toString(mas));
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < enter) {

                System.out.print(mas[i] + ", ");
            }
        }


    }
}
