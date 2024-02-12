package inn.Homework10Throws;

import java.io.IOException;


public class CopierEx {
    public static void main(String[] args) {
        try {
            Copier cFile = new Copier();
        }  catch (Exception e){
            System.out.println("cFile");
        }
        System.out.println("Что-то пошло не так");

    }
}
