package by.academy.lesson6;

public class lecture {
    public static void main(String[] args) {
        String text = "Java Java Java, I'm coding on Java. Java best language";
        int size = "Java".length();
        int indexStart = text.length();
        int indexEnd = 0;
        do {
            indexStart = text.lastIndexOf("Java", indexStart-1);
            indexEnd = indexStart + size;


            if (indexStart >= 0) {
                System.out.println("Start: " + indexStart + " End: " + indexEnd);
            }
        } while (indexStart >= 0);
        }
    }
