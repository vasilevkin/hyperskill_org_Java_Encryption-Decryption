import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        int parametersStart = url.indexOf("?") + 1;
        String parameters = url.substring(parametersStart);
        String[] parArray = parameters.split("&");
        String password = "password";

        for (String p : parArray) {
            String p1 = p.substring(0, p.indexOf("="));
            String p2 = p.substring(p.indexOf("=") + 1);
            String pOut = p1 + " : " + p2;

            if ("pass".equals(p1)) {
                password += " : " + p2;
            }

            if (pOut.substring(pOut.length() - 2).equals(": ")) {
                pOut += "not found";
            }

            System.out.println(pOut);
        }

        if (!("password".equals(password))) {
            System.out.println(password);
        }
        // put your code here
    }
}
