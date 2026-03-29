package patternproblems.easy.numbers;

public class LeftSideReverseNumbers {
    static void main() {

        int lastRow = 4;
        for (int row = 1; row <= lastRow; row++) {
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
