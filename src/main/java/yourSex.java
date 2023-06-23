import java.util.Objects;
import java.util.Scanner;

public class yourSex {
    public static String ySex() {
        System.out.println("Input your sex: ");
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        return sExceptions(date);
    }

    private static String sExceptions(String date) {
        if (Objects.equals(date, "male")) {
            return date;
        } else if (Objects.equals(date, "female")) {
            return date;
        } else {
            throw new NullPointerException("Male or female");
        }
    }
}