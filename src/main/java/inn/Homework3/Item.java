package inn.Homework3;

public class Item {
    String name;
    double price;
    String vendor_code;
    int quantity;
    String color;
    int size;

    public Item(String name, double price,String vendor_code, int quantity,String color, int size){
        this.name = name;
        this.price = 0.0;
        this.vendor_code = vendor_code;
        this.quantity = 1;
        this.color = color;
        this.size = 40;
    }
    public Item(String vendor_code, String name,double price, int quantity){
        this.name = name;
        this.vendor_code = vendor_code;
        this.price = 0;
        this.quantity = 1;
    }

}
