package by.academy.lesson3;

import java.util.Scanner;

public class IfElseDeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (exit == false) {
            System.out.println("");
            System.out.println("Выберите действие:");
            System.out.println("1. Больше, меньше среднее арефм. ");
            System.out.println("2. Проверка на четность");
            System.out.println("3. Калькулятор");
            System.out.println("4. Календарь");
            System.out.println("5. Выход");
            int action = sc.nextInt();
            if (action == 1) {
                System.out.println("Введите 1 число");
                int a = sc.nextInt();
                System.out.println("Введите 2 число");
                int b = sc.nextInt();

                if (a > b) {
                    System.out.println("Ваше большое число: " + a);
                    System.out.println("Ваше меньшее число: " + b);
                    System.out.println("Среднее арифметическое: " + ((a + b) / 2));
                } else if (b > a) {
                    System.out.println("Ваше большое число: " + b);
                    System.out.println("Ваше меньшее число: " + a);
                    System.out.println("Среднее арифметическое: " + ((a + b) / 2));
                } else {
                    System.out.println("Ваши числа равны");
                    System.out.println("Среднее арифметическое: " + ((a + b) / 2));
                }
            } else if (action == 2) {
                System.out.println("Введите число для проверки на четность: ");
                int c = sc.nextInt();
                if (c % 2 == 0) {
                    System.out.println("Ваше число четное");
                } else {
                    System.out.println("Ваше число не четное");
                }
            } else if (action == 3) {
                System.out.println("Калькулятор");
                System.out.println("Введите 1 число");
                int ac = sc.nextInt();
                System.out.println("Введите знак");
                String znak = sc.next();
                System.out.println("Введите 2 число");
                int bc = sc.nextInt();
                if ("*".equals(znak)) {
                    System.out.println("Результат умножения " + ac * bc);
                } else if ("-".equals(znak)) {
                    System.out.println("Результат вычитания: " + (ac - bc));
                } else if ("+".equals(znak)) {
                    System.out.println("Результат сложения: " + (ac + bc));
                } else if ("/".equals(znak) && bc != 0) {
                    if (ac % bc == 0) {
                        int otvet;
                        otvet = ac / bc;
                        System.out.println("Результат деления " + otvet);
                    } else if (ac % bc != 0) {
                        double chastnoe;
                        chastnoe = (double) ac / bc;
                        System.out.println("Результат деления " + chastnoe);
                    }

                } else {
                    System.out.println("Введен неверный синтаксис");


                }
            } else if (action == 4) {
                System.out.println("Введите месяц СЛОВОМ");
                String mounth = sc.next();
                switch (mounth) {
                    case "Январь":
                        System.out.println(1);
                        break;
                    case "Февраль":
                        System.out.println(2);
                        break;
                    case "Март":
                        System.out.println(3);
                        break;
                    case "Апрель":
                        System.out.println(4);
                        break;
                    case "Май":
                        System.out.println(5);
                        break;
                    case "Июнь":
                        System.out.println(6);
                        break;
                    case "Июль":
                        System.out.println(7);
                        break;
                    case "Август":
                        System.out.println(8);
                        break;
                    case "Сентрябрь":
                        System.out.println(9);
                        break;
                    case "Октябрь":
                        System.out.println(10);
                        break;
                    case "Ноябрь":
                        System.out.println(11);
                        break;
                    case "Декабрь":
                        System.out.println(12);
                        break;
                }
            } else if(action == 5){
                exit = true;
                sc.close();
            }else {
                System.out.println("Неверный синтаксис");
            }

        }
    }
}
