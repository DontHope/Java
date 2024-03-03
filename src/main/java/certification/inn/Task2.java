package certification.inn;

import java.time.LocalDate;


public class Task2 {
    public static void main(String[] args) {
// задаем год, месяц и день systemdate
        LocalDate now = LocalDate.now();
        int dsmoonth = now.getMonthValue();
        int dsday = now.getDayOfMonth();
//        System.out.println(now);

//        ScannerDate использовать ввод
        //ввод даты последнего полива
        LocalDate wateringDate = LocalDate.of(2024, 2, 20);
        int dmoonth = wateringDate.getMonthValue();
        int dday = wateringDate.getDayOfMonth();
//        System.out.println(wateringDate);

        int minus = dsday - dday;



        int lvl = 30;
        int random = Random.sensorRandomNum;
//        проверка на зимний период
        if ((Data.Season.WINTER == Data.getSeason(now) || random < lvl) && dmoonth != dsmoonth) {
            System.out.println("Необходимо полить " + now);
        }
//         else {
//            System.out.println("Поливать не нужно");
//        }
//        проверка на весну/осень
        else if ((Data.Season.SUMMER == Data.getSeason(now) || random < lvl) && -2 < minus && minus < 2) {
            System.out.println("Необходимо полить " + now);
        }
//        } else {
//            System.out.println("Поливать не нужно");
//        }
        else if ((Data.Season.AUTUMN == Data.getSeason(now) && Data.Season.SPRING == Data.getSeason(now) || random < lvl) && -7 < minus && minus < 7) {
            System.out.println("Необходимо полить " + now);
        } else {
            System.out.println("Поливать не нужно");
        }
    }
}

