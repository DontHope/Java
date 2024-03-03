package certification.inn;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int world = 62 / 3 * 15; //3*5*62
        int probel = 3 * 12;
        int phraseLength = world + probel;
        System.out.println(phraseLength);
        Scanner fence = new Scanner(System.in);
        int f = fence.nextInt();
        if (f > phraseLength) {
            System.out.println("Надпись не поместится");
        }
        else {
            System.out.println("Надпись поместится");
        }
    }
    }