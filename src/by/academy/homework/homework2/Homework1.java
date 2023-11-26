package by.academy.homework.homework2;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String hello = "hello";
        String[] letters = new String[word.length()];
        String[] hello1 = new String[hello.length()];
        int num1 = 0;
        int num2 = 0;
        int result = 1;
        boolean complete = false;
        if(word.length() == hello.length()) {
            for (int i = 0; i < word.length(); i++){
                char c = word.charAt(i);
                letters[i] = String.valueOf(c);
            }
            for (int i = 0; i < hello.length(); i++) {
                char c = hello.charAt(i);
                hello1[i] = String.valueOf(c);
            }

             while(complete == false) {
                 if (letters[num1].equals(hello1[num2])){
                     result++;
                     num2 = 0;
                     num1++;
                     continue;
                 }

                 if(num2 == hello1.length-1){
                     num2 = 0;
                     num1++;
                 }

                 if (num1 == hello1.length-1){
                     complete = true;
                 }
                 num2++;
             }
             if (result == hello1.length){
                 System.out.println("Ваше слово является перестановкой слова hello");
             } else System.out.println("Ваше слово НЕ является перестановкой слова hello");
        }
        sc.close();
    }

    }



