package patternproblems.easy.numbers;

public class LeftSideRowWiseIncreasing {

    static void main() {

        int lastRow = 5;
        for (int row = 1; row <= lastRow; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
