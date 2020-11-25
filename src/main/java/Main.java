import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rascal rascal = new Rascal();
        try {
            Scanner scanner = new Scanner(new File(args[0]));
            int dataSets = scanner.nextInt();
            int[] rows = new int[dataSets];
            int[] hIndices = new int[dataSets];
            for (int i = 0; i < dataSets; i++) {
                scanner.nextInt();
                rows[i] = scanner.nextInt();
                hIndices[i] = scanner.nextInt();
            }
            for (int i = 0; i < rows.length; i++) {
                System.out.println((i+1) + " " + rascal.getValue(rows[i], hIndices[i]));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
