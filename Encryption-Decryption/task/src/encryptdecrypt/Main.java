package encryptdecrypt;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String mode = "enc";
        String data = "";
        int key = 0;
        AlgorithmType algorithmType = AlgorithmType.SHIFT;
        Algorithm algorithm = new UnicodeAlgorithm();
        String fileToRead = "";
        String outputFile = "";
        String result = "";

        try {
            for (int i = 0; i < args.length; i++) {
                if (Objects.equals(args[i], "-mode")) {
                    mode = args[i + 1];
                    continue;
                }
                if (Objects.equals(args[i], "-key")) {
                    key = Integer.parseInt(args[i + 1]);
                    continue;
                }
                if (Objects.equals(args[i], "-data")) {
                    data = args[i + 1];
                    continue;
                }
                if (Objects.equals(args[i], "-in")) {
                    fileToRead = args[i + 1];
                    continue;
                }
                if (Objects.equals(args[i], "-out")) {
                    outputFile = args[i + 1];
                }
                if (Objects.equals(args[i], "-alg")) {
                    String algName = args[i + 1];

                    switch (algName) {
                        case "shift":
                            algorithmType = AlgorithmType.SHIFT;
                            break;
                        case "unicode":
                            algorithmType = AlgorithmType.UNICODE;
                            break;
                        default:
                            throw new Exception("Unknown algorithm type");
                    }

                }

            }

            switch (algorithmType) {
                case SHIFT:
                    algorithm = new ShiftAlgorithm();
                    break;
                case UNICODE:
                    algorithm = new UnicodeAlgorithm();
                    break;
            }

            switch (mode) {
                case "enc":
                    if (!(data.equals(""))) {
                        result = algorithm.encrypt(data, key);
                    } else if (!(fileToRead.equals(""))) {
                        File file = new File(fileToRead);
                        Scanner scanner = new Scanner(file);
                        String input = "";

                        while (scanner.hasNext()) {
                            input += scanner.nextLine();
                        }

                        result = algorithm.encrypt(input, key);
                    }
                    break;
                case "dec":
                    if (!(data.equals(""))) {
                        result = algorithm.decrypt(data, key);
                    } else if (!(fileToRead.equals(""))) {
                        File file = new File(fileToRead);
                        Scanner scanner = new Scanner(file);
                        String input = "";

                        while (scanner.hasNext()) {
                            input += scanner.nextLine();
                        }

                        result = algorithm.decrypt(input, key);
                    }
                    break;
                default:
                    result = "Unsupported command";
            }

            if (outputFile.equals("")) {
                System.out.println(result);
            } else {
                File file = new File(outputFile);
                PrintWriter writer = new PrintWriter(file);

                writer.append(result);
                writer.close();
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

enum AlgorithmType {
    SHIFT,
    UNICODE
}

abstract class Algorithm {
    public abstract String encrypt(String message, int key);

    public abstract String decrypt(String message, int key);
}

class UnicodeAlgorithm extends Algorithm {

    @Override
    public String encrypt(String message, int key) {
        StringBuilder encrypted = new StringBuilder();

        for (char letter : message.toCharArray()) {
            char newLetter = (char) ((int) letter + key);

            encrypted.append(newLetter);
        }

        return encrypted.toString();
    }

    @Override
    public String decrypt(String message, int key) {
        StringBuilder decrypted = new StringBuilder();

        for (char letter : message.toCharArray()) {
            char newLetter = (char) ((int) letter - key);

            decrypted.append(newLetter);
        }

        return decrypted.toString();
    }
}

class ShiftAlgorithm extends Algorithm {

    char a = 'a';
    char z = 'z';
    char bigA = 'A';
    char bigZ = 'Z';
    int size = 26;

    @Override
    public String encrypt(String message, int key) {
        StringBuilder encrypted = new StringBuilder();

        for (char letter : message.toCharArray()) {
            char newLetter;

            if (letter >= a && letter <= z) {
                newLetter = (char) (((letter - a + key) % size) + a);
            } else if (letter >= bigA && letter <= bigZ) {
                newLetter = (char) (((letter - bigA + key) % size) + bigA);
            } else {
                newLetter = letter;
            }

            encrypted.append(newLetter);
        }

        return encrypted.toString();
    }

    @Override
    public String decrypt(String message, int key) {
        StringBuilder decrypted = new StringBuilder();

        for (char letter : message.toCharArray()) {
            char newLetter;

            if (letter >= a && letter <= z) {
                newLetter = (char) (((letter - a + size - (key % size)) % size) + a);
            } else if (letter >= bigA && letter <= bigZ) {
                newLetter = (char) (((letter - bigA + size - (key % size)) % size) + bigA);
            } else {
                newLetter = letter;
            }

            decrypted.append(newLetter);
        }

        return decrypted.toString();
    }
}
