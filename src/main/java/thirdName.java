import java.util.Scanner;

public class thirdName {
    public static String nameT() {
        System.out.println("Input third name: ");
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        return tExceptions(date);
    }

    private static String tExceptions(String date) {
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
