import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = scanner.nextInt();
        int l = s.length();
        String result = "";

        if (n > l) {
            result = s;
        } else {
            for (int i = 0; i < l; i++) {
                char str = s.charAt((i + n) % l);
                result += str;
            }
        }

        System.out.println(result);
        // put your code here
    }
}
