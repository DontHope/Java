package inn.Homework1;

import java.util.Scanner;

public class Card {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String card =in.nextLine();
        String cardN = card.substring((card.length() - 4));
        System.out.println("**** **** ****" + cardN);

        String cardNumber1 = "1234 5678 9012 3456";
        String result = cardNumber1.replace("1234 5678 9012","**** **** ****");
        System.out.println(result);
    }

}
