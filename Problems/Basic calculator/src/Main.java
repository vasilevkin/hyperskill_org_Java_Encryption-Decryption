class Problem {

    public static void main(String[] args) {
        String operator = args[0];
        int n1 = Integer.parseInt(args[1]);
        int n2 = Integer.parseInt(args[2]);
        String result = "Unknown operator";

        switch (operator) {
            case "+":
                result = String.valueOf(n1 + n2);
                break;
            case "-":
                result = String.valueOf(n1 - n2);
                break;
            case "*":
                result = String.valueOf(n1 * n2);
                break;
            default:
        }

        System.out.println(result);
    }
}
