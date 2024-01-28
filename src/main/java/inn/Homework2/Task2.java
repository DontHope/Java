package inn.Homework2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        Flat kv = new Flat ("Кухня","Ванна", "Спалья", "балкон");

        Room r1 = new Room(3,"стол","стул");
        System.out.println(kv.kitchen + " имеет высоту потолков " + r1.height + ", ширина " + r1.width + ", имеет:" + r1.chair + " и " + r1.table);

        Room r2 = new Room(2);
        System.out.println(kv.bathroom + " имеет высоту потолков " + r2.height + ", ширину " + r2.width);
    }
}
