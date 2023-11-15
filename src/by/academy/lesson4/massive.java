package by.academy.lesson4;

import java.util.Arrays;

public class massive {
    public static void main(String[] args) {
        String[] days = new String[7];
        days[0] = "ПН";
        days[1] = "ВТ";
        days[2] = "СР";
        days[3] = "ЧТ";
        days[4] = "ПТ";
        days[5] = "СБ";
        days[6] = "ВС";
        System.out.println(Arrays.toString(days));
        //String[] days1 = {"ПН", "ВТ","СР","ЧТ","ПТ","СБ","ВС"};
        System.out.println(days[days.length-1]);

    }
}
