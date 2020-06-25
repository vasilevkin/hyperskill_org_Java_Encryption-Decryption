import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = new LinkedList<>();

        while (true) {
            String value = scanner.nextLine();
            if (value.equals("0")) {
                break;
            }
            input.add(value);
        }

        for (String value : input) {
            try {
                int number = Integer.parseInt(value);
                System.out.println(number * 10);
            } catch (Exception e) {
                System.out.println("Invalid user input: " + value);
            }
        }
        // put your code here
    }
}
