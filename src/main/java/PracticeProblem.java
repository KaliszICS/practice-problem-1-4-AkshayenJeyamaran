import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PracticeProblem {
    public static String getName(int line, String file) {
        try {
            Scanner sc = new Scanner(new File(file));
            int count = 1;
            while (sc.hasNextLine()) {
                String current = sc.nextLine();

                if (count == line) {
                    String[] parts = current.split(" ");
                    sc.close();
                    return parts[0] + " " + parts[1];
                }
                count++;
            }
            sc.close();
        } catch (Exception e) {}
        return "";
    }
    public static int getAge(int line, String file) {
        try {
            Scanner sc = new Scanner(new File(file));
            int count = 1;

            while (sc.hasNextLine()) {
                String current = sc.nextLine();
                if (count == line) {
                    String[] parts = current.split(" ");
                    sc.close();
                    return Integer.parseInt(parts[2]);
                }
                count++;
            }

            sc.close();
        } catch (Exception e) {}
        return -1;
    }
    public static int getNumber(int line, String file) {
        try {
            Scanner sc = new Scanner(new File(file));
            int count = 1;

            while (sc.hasNextLine()) {
                String current = sc.nextLine();

                if (count == line) {
                    String[] parts = current.split(" ");
                    sc.close();
                    return Integer.parseInt(parts[3]);
                }
                count++;
            }
            sc.close();
        } catch (Exception e) {}
        return -1;
    }
    public static void fileAppend(String output, String filename) {
        try {
            FileWriter fw = new FileWriter(filename, true);
            fw.write(output);
            fw.close();
        } catch (IOException e) {}
    }
}