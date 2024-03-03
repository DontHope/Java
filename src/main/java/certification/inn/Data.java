package certification.inn;

import java.time.LocalDate;



public class Data {


     enum Season {
        WINTER,
        SPRING,
        SUMMER,
        AUTUMN;
    }

    public static Season getSeason(LocalDate date) {
        var m = date.getMonthValue();
        return switch (m) {
            case 1, 2, 12 -> Season.WINTER;
            case 3, 4, 5 -> Season.SPRING;
            case 6, 7, 8 -> Season.SUMMER;
            case 9, 10, 11 -> Season.AUTUMN;
            default -> throw new IllegalStateException("Unexpected value: " + m);
        };
    }
}
