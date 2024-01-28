package inn.Homework4;
import java.util.stream.IntStream;

public class T4 {
    public static void main(String[] args) {
        for(int i = 0; i < 100000001; i++) {
            System.out.println(i);
        }

        IntStream stream = IntStream.range(1,100000001);
        stream.forEach(System.out::println);
    }


}
