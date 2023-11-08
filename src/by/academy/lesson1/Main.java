package by.academy.lesson1;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String bc;
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        boolean i = false;

        while (i == false) {
            String ex = "";
            System.out.println("To exit calc enter: exit. To start press enter");
            System.out.println(" ");
            ex = sc.nextLine();
            if (ex.equals("exit")) {
                i = true;
            } else {
                System.out.println("Enter 1 num");
                a = sc.nextInt();
                System.out.println("Enter 2 num");
                b = sc.nextInt();
                System.out.println("Enter an action");
                bc = sc.next();

                if (bc.equals("+")) {
                    System.out.println(a + b);
                } else if (bc.equals("-")) {
                    System.out.println(a - b);
                } else {
                    System.out.println("invalid action");
                }


            }
        }
    }

}


