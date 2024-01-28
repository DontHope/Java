package inn.Homework5;

public class Task5 {
    public static void main(String[] args) {
    String password = "hhrdssgHGGR";
    if( 8 > password.length() ) {
        System.out.println("Пароль не менее 8 символов");
    }
    if (password.contains("[0-9]+")) {
        System.out.println("Пароль должен содержать минимум одну цифру");
        }
    if (password.contains("\\W")) {
            System.out.println("Пароль должен содержать минимум один спецсимвол");
        }
    else {
        System.out.println("Пароль принят");
    }
}

}
