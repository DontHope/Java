package inn.Homework5;

public class Task5 {
    public static void main(String[] args) {
    String password = "hffff8@hr";
    if (password.length() < 8) {
        System.out.println("Пароль не менее 8 символов");
            return;
    }
    if (password.matches (". \\* \\d. \\* ")) {
        System.out.println("Пароль должен содержать минимум одну цифру");
        return;
        }

    if (password.matches(". \\* [!@#$%^& \\* ()\\_+]. \\* "))  {
            System.out.println("Пароль должен содержать минимум один спецсимвол");
        return;
        }
    else {
        System.out.println("Пароль принят");
    }
}

}
