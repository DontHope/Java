package inn.Homework5;

public class Task4 {


    public static void main(String[] args) {
        String url = "https://www.youtube.com/";
        if(url.startsWith("https://")) {
            System.out.println("Соеднинение безопасно");
        }
        else {
            System.out.println("Небезопано.Не указывайте логины,пароли и данные банковских карт");
        }
    }
    }

