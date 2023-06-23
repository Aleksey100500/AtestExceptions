import java.util.Scanner;

public class dob {
    public static String dateOfBirth() {
        System.out.println("Input date of birthday format dd.mm.yy: ");
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        return dExceptions(date);
    }
    private static String dExceptions(String date) {
        if (date.length() < 8) {
            throw new NullPointerException("Invalid format need dd.mm.yy: ");
        } else if (date.length() > 8) {
            throw new NullPointerException("Invalid format need dd.mm.yy: ");
        }
        return date;
    }
}
