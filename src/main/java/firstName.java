import java.util.Scanner;

public class firstName {

    public static String nameF() {
        System.out.println("Input first name: ");
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        return fExceptions(date);
    }

    private static String fExceptions(String date) {
        if (date.matches(".*\\d.*")) {
            try {
                throw new NumberFormatException("First name must be without numbers");
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        } else {
            return date;
        }
        return null;
    }
}
