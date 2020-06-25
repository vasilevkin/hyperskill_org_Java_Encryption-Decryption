import java.io.File;
import java.util.Scanner;

public class FileCountSumTask {
    public static void main(String[] args) {
        String filePath = "/Users/svasilev/Downloads/dataset_91033.txt";
        File file = new File(filePath);
        int sum = 0;

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                int number = scanner.nextInt();
                sum += number;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(sum);
    }
}
