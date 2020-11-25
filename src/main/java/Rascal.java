

public class Rascal {


    public Rascal() {
    }

    public int getValue(int row, int hIndex) {
        if (hIndex == 0 || hIndex == row + 1 || row == 0) {
            return 1;
        } else if (hIndex == 1 || hIndex == row) {
            return row;
        } else {
            if (hIndex > row / 2) {
                hIndex = row - hIndex;
            }
            int val = row;
            int spacer = row - 3;
            for (int i = 2; i <= hIndex; i++) {
                val += spacer;
                spacer -= 2;
            }
            return val;
        }
    }
}
