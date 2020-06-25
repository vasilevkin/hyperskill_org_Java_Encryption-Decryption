import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class FilePopulatioIncreaseTask {
    public static void main(String[] args) {
        String filePath = "/Users/svasilev/Downloads/dataset_91069.txt";
        File file = new File(filePath);
        ArrayList<Long> population = new ArrayList<>();
        ArrayList<Integer> years = new ArrayList<>();
        long populationIncrease = 0;
        int year = 0;

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String line = scanner.nextLine();

                if (line.startsWith("year")) continue;

                long value = Long.parseLong(line.substring(4).trim().replace(",", ""));
                Integer thisYear = Integer.parseInt(line.substring(0, 5).trim());

                population.add(value);
                years.add(thisYear);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        for (int i = 1; i < population.size(); i++) {
            long number = (long) (population.get(i) - population.get(i - 1));

            if (number > populationIncrease) {
                populationIncrease = number;
                year = years.get(i);
            }
        }

        System.out.println(Arrays.toString(population.toArray()));
        System.out.println("population increase = " + populationIncrease);
        System.out.println(year);
    }
}
