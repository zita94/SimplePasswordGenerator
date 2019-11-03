
import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // user input for password length
        System.out.print("How many characters should the password be? ");
        int length = scanner.nextInt();

        // characters included in password
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789$.";

        Random rand = new Random();

        // randomize character
        // repeat until length of password which was input by user
        String password = "";
        for (int i = 0; i < length; i++) {
            password += chars.charAt(rand.nextInt(chars.length()));
        }

        // print new password
        System.out.println("Your generated password is: " + password);

        scanner.close();
    }
}
