package by.academy.homework.homework2;

import java.io.IOException;
import java.util.Scanner;

public class Homework0 {
    // Complete the pairs function below.
    static int pairs(int k, int[] arr) {
        int pairsCount = 0;
        int check = 0;
        int check2 = 0;
        int max = arr.length + 1;
        for (int i = 0; i < max; i++) {
            if (arr[check] - arr[check2] == k) {
                System.out.println("Пара найдена!!");
                pairsCount++;
            }
            check2++;
            if (check2 == arr.length) {
                check2 = 0;
                i = 0;
                check++;
            }
            if (check == arr.length){
                i += 100;
            }
        }
        return pairsCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(arrItems[i]);
            System.out.println(arr[i]);
        }

        int result = pairs(k, arr);
        System.out.println(result);
        scanner.close();
    }
}