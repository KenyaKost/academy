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
        switch (type) {
            case ("int"):
                num = Integer.valueOf(enter);
                System.out.println("Вывод: " + (num % 2));
                break;
            case ("double"):
                num = Integer.valueOf(enter);
                System.out.println("Вывод: " + (num * 70.0 / 100));
                break;
            case ("float"):
                num = Integer.valueOf(enter);
                System.out.println("Вывод: " + (num * num));
                break;
            case ("String"):
                System.out.println("Hello " + enter);
                break;
            default:
                System.out.println("Unsupported type");

        }
    }
}
