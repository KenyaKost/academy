package by.academy.homework.homework1;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int enter = sc.nextInt();

        if (enter <= 10 && enter >= 1) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(enter + " * " + i + " = " + enter * i);
            }
        } else System.out.println("Неверный синтаксис");
    }
}
