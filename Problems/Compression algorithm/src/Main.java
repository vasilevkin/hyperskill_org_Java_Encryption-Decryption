import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.nextLine().toCharArray();
        int count = 1;
        String output = "";

        if (s.length == 1) {
            output += s[0] + "1";
        } else {
            for (int i = 1; i < s.length; i++) {
                if (s[i] == s[i - 1]) {
                    count++;
                } else {
                    output += s[i - 1] + "" + count;
                    count = 1;
                }
            }
            if (count > 1) {
                output += s[s.length - 1] + "" + count;
            } else if (s[s.length - 1] != s[s.length - 2]) {
                output += s[s.length - 1] + "" + 1;
            }
        }

        System.out.println(output);
        // put your code here
    }
}
