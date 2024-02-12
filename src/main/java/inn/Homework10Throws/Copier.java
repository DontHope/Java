package inn.Homework10Throws;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Copier {
    public static void main(String[] args) throws IOException {
//       List<String> copyTextFile = Files.readAllLines(Path.of("C:\\Users\\21117868\\Desktop\\HW.txt"));
//        for (String str : copyTextFile)
//            System.out.println(str);
////        Path path = Path.of("C:\\Users\\21117868\\Desktop\\Homework").getFileName();
//        Path writeString = Files.writeString(Path.of("C:\\Users\\21117868\\Desktop\\HW2.txt"));
//        System.out.println(writeString);
//    }
        List<String> copyTextFile = null;
        copyTextFile = Files.readAllLines(Path.of("C:\\Users\\21117868\\Desssktop\\HW.txt"));
        for (String file : copyTextFile)
            System.out.println(file);

        Path copyTextFile2 = null;
        copyTextFile2 = Files.writeString(Path.of("\"C:\\Users\\21117868\\Desssktop\\HW2.txt"),"text");
        System.out.println(copyTextFile2);
    }
}
