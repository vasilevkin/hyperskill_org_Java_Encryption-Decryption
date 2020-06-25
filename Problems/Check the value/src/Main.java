import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        boolean inRange = false;

        if (value < 10 && value > 0) {
            inRange = true;
        }

        System.out.println(inRange);
        // put your code here
    }
}
