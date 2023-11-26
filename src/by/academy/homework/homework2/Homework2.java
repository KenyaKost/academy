package by.academy.homework.homework2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество слов:");
        int n = scanner.nextInt();

        String minDiffWord = "";
        int minDiffCount = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.println("Введите слово:");
            String word = scanner.next();

            Set uniqueChars = new HashSet<>();

            for (char ch : word.toCharArray()) {
                uniqueChars.add(ch);
            }

            if (uniqueChars.size() < minDiffCount) {
                minDiffCount = uniqueChars.size();
                minDiffWord = word;
            }
        }

        System.out.println("Слово с минимальным количеством различных символов: " + minDiffWord);
        scanner.close();
    }
}