package IharKoshman;

import java.util.Scanner;

public class SecretMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a message to encode or decode: ");
        String message = scanner.nextLine();
        String output = "";
        System.out.print("Enter a secret key (-25 to 25): ");
        int keyVal = Integer.valueOf(scanner.nextLine());
        char key = (char) keyVal;

        for (int i = 0; i < message.length(); ++i) {
            char input = message.charAt(i);
            if (input >= 'A' && input <= 'Z') {
                input += key;
                if (input > 'Z'){
                    input -= key + key;
                }
                if (input < 'A'){
                    input += key + key;
                }
            } else if (input >= 'a' && input <= 'z'){
                input += key;
                if (input > 'z'){
                    input -= key + key;
                }
                if (input < 'a'){
                    input += key + key;
                }
            } else if (input >= '0' && input <= '9') {
                input += keyVal % 10;
                if (input > '9'){
                    input -= 10;
                }
                if (input < '0'){
                    input += 10;
                }
            }
            output += input;
        }
        System.out.println(output);
        scanner.close();
    }
}
