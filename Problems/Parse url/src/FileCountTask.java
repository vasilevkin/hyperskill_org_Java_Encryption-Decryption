import java.io.File;
import java.util.Scanner;

public class FileCountTask {
    public static void main(String[] args) {
        String filePath = "/Users/svasilev/Downloads/dataset_91022.txt";
        File file = new File(filePath);
        int count = 0;
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                int number = scanner.nextInt();

                if (number >= 9999) {
                    count++;
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(count);
    }
}
