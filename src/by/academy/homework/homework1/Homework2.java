package by.academy.homework.homework1;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите тип данных");
        String type = sc.nextLine();
        System.out.println("Введите переменную");
        String enter = sc.nextLine();
        double num;
        int num1;
        switch (type) {
            case ("int"):
                num1 = Integer.valueOf(enter);
                System.out.println("Остаток от деления: " + (num1 % 2));
                break;
            case ("double"):
                num = Integer.valueOf(enter);
                System.out.println("70% от числа: " + (num * 70.0 / 100));
                break;
            case ("float"):
                num = Integer.valueOf(enter);
                System.out.println("Квадрат числа: " + (num * num));
                break;
            case ("String"):
                System.out.println("Hello " + enter);
                break;
            default:
                System.out.println("Unsupported type");

        }
    }
}
