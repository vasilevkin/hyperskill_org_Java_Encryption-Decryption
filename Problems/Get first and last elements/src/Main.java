import java.util.*;

public class Main {

    public static int[] getFirstAndLast(int[] input) {
        int[] output = new int[2];
        output[0] = input[0];
        output[1] = input[input.length - 1];

        return output;
    }
    // write a method here

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}