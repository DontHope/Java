package inn.Homework5;

public class Task3 {
    public static void main(String[] args) {
        int click = 12;
        if (click%4== 0)  {
            System.out.println("Четное.Кратное четырем");
        } else if (click%3== 0 && click%2== 1) {
            System.out.println("Нечетное.Кратное трем");
        }
        else {
            System.out.println("Не равно ни одному условию");
        }
    }
}