package by.academy.homework.homework1;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму");
        double sum = sc.nextInt();
        System.out.println("Введите возраст");
        int age = sc.nextInt();
        if (sum < 100 && sum > 0) {

            System.out.println("Финальная цена: " + (sum - (sum * 5.0 / 100)) + " рублей");
        } else if (sum >= 100 && sum < 200){
            System.out.println("Финальная цена: " + (sum - (sum * 7.0 / 100)) + " рублей");
        } else if( sum >= 200 && sum <300 ){
            if(age > 18){
                System.out.println("Финальная цена: " + (sum - (sum * 16.0 / 100)) + " рублей");
            } else
                System.out.println("Финальная цена: " + (sum - (sum * 9.0 / 100)) + " рублей");


        } else if(sum >= 400){
            System.out.println("Финальная цена: " + (sum - (sum * 20.0 / 100)) + " рублей");
        } else System.out.println("Неверный синтаксис");
    }
}
