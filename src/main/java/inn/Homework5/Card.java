package inn.Homework5;


public class Card {
    String number;
    int expirationDate;
    int cvv;
    static int pincode;

    public Card(String number, int expirationDate, int cvv, int pincode) {
        this.number = number;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
        this.pincode = pincode;
    }
    public Card(String number) {
        this.number = number;

    }
    public Card(String number,int pincode) {
        this.number = number;
        this.pincode = pincode;

    }


    public static void main(String[] args) {
        Card card = new Card("1234 5678 9012 3456");
        String cardN = card.number.substring((card.number.length() - 4));
        System.out.println("**** **** **** " + cardN);

        Card pin = new Card("1234 5678 9012 3456",4567);
        if (Card.pincode == 4567)
        {
            System.out.println(pin.number);
        }
        else {
            String card1 = pin.number.substring((pin.number.length() - 4));
            System.out.println("**** **** **** " + card1);
        }
    }
    }

