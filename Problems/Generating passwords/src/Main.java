import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();
        String output = "";

        do {
            for (int i = 0; i < a; i++) {
                if (i % 2 == 0) {
                    output += "A";
                } else {
                    output += "B";
                }
            }

            for (int i = 0; i < b; i++) {
                if (i % 2 == 0) {
                    output += "a";
                } else {
                    output += "b";
                }
            }

            for (int i = 0; i < c; i++) {
                if (i % 2 == 0) {
                    output += "1";
                } else {
                    output += "2";
                }
            }

            if (output.length() % 2 == 0) {
                output += "@";
            } else {
                output += "&";
            }
        } while (output.length() < n);

        String outputString = output.substring(0, n);

        System.out.println(outputString);
        // write your code here
    }
}
