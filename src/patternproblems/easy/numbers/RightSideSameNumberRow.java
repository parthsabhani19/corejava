package patternproblems.easy.numbers;

public class RightSideSameNumberRow {
    static void main() {

        int lastRow = 4;
        for (int row = 1; row <= lastRow; row++) {
            for (int col = lastRow; col >= row; col--) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }
}
