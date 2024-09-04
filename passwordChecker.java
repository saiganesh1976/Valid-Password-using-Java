import java.util.*;

public class passwordChecker {
    public static int checkPassword(String password, int length) {
        if (length < 4) {
            return 0;
        }
        if (password.charAt(0) >= '0' && password.charAt(0) <= '9') {
            return 0;
        }
        int captialLetters = 0;
        int numbers = 0;
        for (int i = 0; i < length; i++) {
            if (password.charAt(i) == ' ' || password.charAt(i) == '/') {
                return 0;
            }
            if (password.charAt(i) >= 'A' || password.charAt(i) <= 'Z') {
                captialLetters++;
            }
            if (password.charAt(i) >= '0' || password.charAt(i) <= '9') {
                numbers++;
            }
        }
        if (captialLetters > 0 && numbers > 0) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Password: \t");
        String passwordInput = s.nextLine();
        int result = checkPassword(passwordInput, passwordInput.length());
        if (result == 1) {
            System.out.println(passwordInput + " is a Valid password");
        } else {
            System.out.println(passwordInput + " is not a Valid password");
        }
    }
}
