package by.academy.lesson4;

import java.util.Scanner;

public class forWhile {
    public static void main(String[] args) {
//        for(int i = 10; i <= 20; i++){
//            System.out.println("Квадрат чисел: " + i*i);
//        }
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("программа для вычисления суммы чисел от 1 до n");
//        System.out.println("Введите n: ");
//        int enter = sc.nextInt();
//        int sum = 0;
//        for(int i = 1; i < enter; i++){
//            sum = sum + i;
//
//        }
//        System.out.println("Сумма чисел: " + sum);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("программа для вычисления произведения чисел от 1 до n");
//        System.out.println("Введите n: ");
//        int sum = 0;
//        int enter = sc.nextInt();
//        for (int i = 1; i < enter; i++) {
//            sum = i * i;
//
//        }
//        System.out.println("произведение чисел: " + sum);
    for(int i = 0; i <= 100; i++){
        if(i % 13 ==0){
            System.out.print(""); // Таким образом я пропускаю все числа которые кратны 13
            continue;
        }
        System.out.println(i); // обязательно в конце
    }

    }
}
