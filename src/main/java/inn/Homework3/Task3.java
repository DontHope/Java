package inn.Homework3;

public class Task3 {

    public static void main(String[] args) {

        Item i1 = new Item("dress",256.3, "F30402J00", 2, "Black", 44);
        System.out.println(i1.name + " " + i1.price + " " + i1.vendor_code + " " + i1.quantity + " " + i1.color + " " + i1.size );

        Item i2 = new Item("3559FO", "Cat",0, 1);
        System.out.println(i2.name + " " + i2.vendor_code + " " + i2.quantity);
    }
}
