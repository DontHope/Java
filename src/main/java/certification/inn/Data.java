package certification.inn;

import java.time.LocalDate;



public class Data {
//    LocalDate Winterdate = LocalDate.of(2024,2,28);
//    LocalDate Winterdate1 = LocalDate.of(2024,12,31);
//    LocalDate spring = LocalDate.of(2024, 5, 31);
//    LocalDate autumn = LocalDate.of(2024,9,1);
//    LocalDate autumn2 = LocalDate.of(2024,11,30);
//    LocalDate SummerDate5 = LocalDate.of(2024,6,1);
//    LocalDate SummerDate6 = LocalDate.of( 2024,8,31);


//        public static void main(String[] args) {
//            var d = LocalDate.now();
//
//            if (Season.WINTER.equals(getSeason(d))) {
//                System.out.println("Это зима");
//            } else {
//                System.out.println("Это не зима");
//            }
//
//        }

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
