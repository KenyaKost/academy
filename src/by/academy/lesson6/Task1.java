package by.academy.lesson6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введие предложение: ");
        String enter = sc.nextLine();
        int len = enter.length() - 1;
        System.out.println("Последний символ вашего ввода: " + "'" + enter.charAt(len) + "'");
        if (enter.endsWith("!!!")) {
            System.out.println("Ваш вывод заканчивается на: '!!!'");
        } else System.out.println("Ваш вывод не заканчивается на: '!!!'");

        if (enter.startsWith("I like")) {
            System.out.println("Ваш вывод начинается на 'I like'");
        } else System.out.println("Ваш вывод не начинается на 'I like'");

        if (enter.contains("Java")) {
            System.out.println("Ваш вывод содержит подстроку “Java”");
            int index = enter.indexOf("Java");
            System.out.println("Позиция подстроки 'Java': " + index);
        } else System.out.println("Ваш вывод не содержит подстроку “Java”");
        String newStr = enter.replace('a', 'o');
        System.out.println("После замены на 'o  ': "+newStr);
        System.out.println("Вывод в верхнем регистре: " + enter.toUpperCase());
        System.out.println("Вывод в нижнем регистре: " + enter.toLowerCase());
        if (enter.contains("Java")) {
            int index1 = enter.indexOf("Java");
            String newStr1 = enter.replace(enter.substring(index1, index1 + 4), "");
            System.out.println("Вывод с вырезанной строкой: " + newStr1);
        }





    }
}

