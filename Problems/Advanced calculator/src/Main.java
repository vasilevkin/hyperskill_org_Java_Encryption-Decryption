/* Please, do not rename it */
class Problem {

    public static void main(String[] args) {
        String operator = args[0];
        String result = "Unknown operator";

        switch (operator) {
            case "MAX":
                result = max(args);
                break;
            case "MIN":
                result = min(args);
                break;
            case "SUM":
                result = sum(args);
                break;
            default:
        }

        System.out.println(result);
        // write your code here
    }

    private static String max(String[] args) {
        int max = Integer.MIN_VALUE;

        for (int i = 1; i < args.length; i++) {
            int number = Integer.parseInt(args[i]);
            if (number > max) {
                max = number;
            }
        }

        return String.valueOf(max);
    }

    private static String min(String[] args) {
        int min = Integer.MAX_VALUE;

        for (int i = 1; i < args.length; i++) {
            int number = Integer.parseInt(args[i]);
            if (number < min) {
                min = number;
            }
        }

        return String.valueOf(min);
    }

    private static String sum(String[] args) {
        int sum = 0;

        for (int i = 1; i < args.length; i++) {
            int number = Integer.parseInt(args[i]);
            sum += number;
        }

        return String.valueOf(sum);
    }
}
