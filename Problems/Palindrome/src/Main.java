import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] input = scanner.next().toCharArray();
        int l = input.length;
        boolean isPalindrome = true;

        for (int i = 0; i < l / 2; i++) {
            if (input[i] != input[l - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        // put your code here
    }
}
