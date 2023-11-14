package by.academy.homework.homework1;

public class Homework4 {
    public static void main(String[] args) {
//        double a = 2;
//        while (a <= 1000000) {
//            a = a * a;
//            System.out.println(a);
        int result = 1;
        int power = 0;

        while (result <= 1000000) {
            System.out.println("2 в степени " + power + " = " + result);
            power++;
            result = (int) Math.pow(2, power);
        }
    }
}
