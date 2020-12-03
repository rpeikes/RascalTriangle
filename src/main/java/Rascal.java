

public class Rascal {


    public Rascal() {
    }

    public int getValue(int row, int hIndex) {
        if (isOnPerimeter(row, hIndex)) {
            return 1;
        } else if (isNextToPerimeter(row, hIndex)) {
            return row;
        } else {
            return traverseRowToIndex(row, hIndex);
        }
    }

    private int traverseRowToIndex(int row, int hIndex) {
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

    private boolean isNextToPerimeter(int row, int hIndex) {
        return hIndex == 1 || hIndex == row;
    }

    private boolean isOnPerimeter(int row, int hIndex) {
        return hIndex == 0 || hIndex == row + 1 || row == 0;
    }
}
