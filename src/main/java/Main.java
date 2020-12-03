import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(new File(args[0]));
            int dataSets = scanner.nextInt();
            int[] rows = new int[dataSets];
            int[] hIndices = new int[dataSets];
            readInput(scanner, dataSets, rows, hIndices);
            printSolution(new Rascal(), rows, hIndices);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void readInput(Scanner scanner, int dataSets, int[] rows, int[] hIndices) {
        for (int i = 0; i < dataSets; i++) {
            scanner.nextInt();
            rows[i] = scanner.nextInt();
            hIndices[i] = scanner.nextInt();
        }
    }

    private static void printSolution(Rascal rascal, int[] rows, int[] hIndices) {
        for (int i = 0; i < rows.length; i++) {
            System.out.println((i+1) + " " + rascal.getValue(rows[i], hIndices[i]));
        }
    }
}
