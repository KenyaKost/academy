package by.academy.lesson5;

import java.util.Arrays;
import java.util.Random;

public class CopyArrayDemo {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        int[] copy = new int[array.length*2+1];
//        for(int i = 0; i < array.length; i++){
//            copy[i] = array[i];
//        }
//        System.out.println(Arrays.toString(copy));
//

    }
}
