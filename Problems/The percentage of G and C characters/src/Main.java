import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        int countCG = 0;

        for (int i = 0; i < input.length(); i++) {
            if ((input.charAt(i) == 'c') || (input.charAt(i) == 'g')) {
                countCG++;
            }
        }
        double result = (double) countCG / input.length() * 100;

        System.out.print(result);
        // put your code here
    }
}
