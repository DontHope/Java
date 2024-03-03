package certification.inn;

public class Random {
    //    public static void main(String[] args) {
    // реализовать датчик(генерация радномного числа 0-100%)
    static int maximum = 100;
    static int minimum = 0;
    static java.util.Random sensor = new java.util.Random();
    public static int sensorRandomNum = sensor.nextInt(maximum - minimum + 1);
//        System.out.println(sensorRandomNum);
}
//}
