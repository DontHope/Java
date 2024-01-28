package inn.Homework;

import java.util.Locale;

public class Homework1 {
    public static void main(String[] args) {
        //на пустое значение строки, при пробеле считает, что строка не пустая
        String wordl = " ";
        boolean res = wordl.isEmpty();
        System.out.println(res);

        //на пустое значение строке + наличие пробела
        String wordl1 = " ";
        boolean res1 = wordl1.isBlank();
        System.out.println(res1);

        //считает количество символов в строке
        String city = "word";
        int result = city.length();
        System.out.println(result);

        //возвращает строку с указанного индекеса и до указанного
        String city1 = " word";
        String result1 = city1.substring(1,3);
        System.out.println(result1);

        //находит на каком месте находится индекс в строке
        String city2 = "word!";
        int result2 = city2.indexOf('!');
        System.out.println(result2);

        //находит на каком месте находится индекс в строке с конца
        String w = "mordor!";
        int result3 = w.lastIndexOf('o');
        System.out.println(result3);

        //переводит все символы строки в нижний регистр
        String city4 = "WORD!";
        String result4 = city4.toLowerCase(Locale.ROOT);
        System.out.println(result4);

        //переводит все символы строки в врхний регистр
        String w1 = "mordor!";
        String result5 = w1.toUpperCase();
        System.out.println(result5);

        //заменяет значение (ctrl+h)
        String w2 = "Word";
        String result6 = w2.replace("Word", "ward");
        System.out.println(result6);

        //проверка на истину начинается ли строка с указанного индекса
        String w4 = "mordor!";
        boolean result7 = w4.startsWith("mor");
        System.out.println(result7);

        //проверка на истину заканчивается ли строка с указанного индекса
        String w5 = "mordor!";
        boolean result8 = w4.endsWith("mor");
        System.out.println(result8);

        //повтор строки
        String w6 = "welcome!";
        String result9 = w6.repeat(2);
        System.out.println(result9);

        //добавляет к окончанию символы или текст
        String w7 = "welcome to course!";
        String result10 = w7.concat("  !!!");
        System.out.println(result10);

        //удаляет пробелы до и после
        String w8 = "  welcome to course!  ";
        String result11 = w8.trim();
        System.out.println(result11);


    }
}
