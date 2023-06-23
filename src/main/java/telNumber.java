import java.util.InputMismatchException;
import java.util.Scanner;

public class telNumber {
    public static String phoneNumber() {
        System.out.println("Input phone number: ");
        Scanner sc = new Scanner(System.in);
        Integer numb = sc.nextInt();
        phoneException(numb);
        String number = numb.toString();
        return number;
    }

    private static Integer phoneException(Integer date) {
        if (date > 999999999) {
            throw new NumberFormatException("Format phone number is 25/29/33/44*******.");
        } else if (date < 999999999/10){
            throw new NumberFormatException("Format phone number is 25/29/33/44*******.");
        }
        return date;
    }
}
