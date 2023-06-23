import java.util.Objects;
import java.util.Scanner;

public class lastName {
    public static String nameS() {
        System.out.println("Input last name: ");
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        return sExceptions(date);
    }

    private static String sExceptions(String date) {
        if (date.matches(".*\\d.*")) {
            try {
                throw new NumberFormatException("Last name must be without numbers");
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        } else {
            return date;
        }
        return null;
    }
}
