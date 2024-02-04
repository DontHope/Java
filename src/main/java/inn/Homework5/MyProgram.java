package inn.Homework5;

public class MyProgram {

    private String number;
    private int expirationDate;
    private int cvv;
    private int pincode;

    public MyProgram(String number, int expirationDate, int cvv, int pincode) {
        this.number = number;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
        this.pincode = pincode;
    }

    public static void main(String[] args)
    {
        MyProgram card = new MyProgram("1234 5678 9012 3456",1024,567,4162);
        System.out.println(card);
    }
}
