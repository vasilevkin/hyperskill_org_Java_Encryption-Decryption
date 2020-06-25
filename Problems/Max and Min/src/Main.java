import java.util.Scanner;

class Finder {

    private FindingStrategy strategy;

    public Finder(FindingStrategy strategy) {
        this.strategy = strategy;
        // write your code here
    }

    /**
     * It performs the search algorithm according to the given strategy
     */
    public int find(int[] numbers) {
        return strategy.getResult(numbers);
        // write your code here
    }
}

interface FindingStrategy {

    /**
     * Returns search result
     */
    int getResult(int[] numbers);

}

class MaxFindingStrategy implements FindingStrategy {

    public int getResult(int[] numbers) {
        int maxValue = Integer.MIN_VALUE;
        if (numbers.length == 0) return maxValue;
        if (numbers.length == 1) return numbers[0];

        maxValue = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (maxValue < numbers[i]) {
                maxValue = numbers[i];
            }
        }

        return maxValue;
        // write your code here
    }
}

class MinFindingStrategy implements FindingStrategy {

    public int getResult(int[] numbers) {
        int minValue = Integer.MAX_VALUE;
        if (numbers.length == 0) return minValue;
        if (numbers.length == 1) return numbers[0];

        minValue = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (minValue > numbers[i]) {
                minValue = numbers[i];
            }
        }

        return minValue;
        // write your code here
    }
}

/* Do not change code below */
public class Main {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final String[] elements = scanner.nextLine().split("\\s+");
        int[] numbers = null;

        if (elements[0].equals("EMPTY")) {
            numbers = new int[0];
        } else {
            numbers = new int[elements.length];
            for (int i = 0; i < elements.length; i++) {
                numbers[i] = Integer.parseInt(elements[i]);
            }
        }

        final String type = scanner.nextLine();

        Finder finder = null;

        switch (type) {
            case "MIN":
                finder = new Finder(new MinFindingStrategy());
                break;
            case "MAX":
                finder = new Finder(new MaxFindingStrategy());
                break;
            default:
                break;
        }

        if (finder == null) {
            throw new RuntimeException(
                    "Unknown strategy type passed. Please, write to the author of the problem.");
        }

        System.out.println(finder.find(numbers));
    }
}