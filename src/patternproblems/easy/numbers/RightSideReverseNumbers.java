package patternproblems.easy.numbers;

public class RightSideReverseNumbers {
    static void main() {

        int lastRow = 4;
        for (int row = 1; row <= lastRow; row++) {
            for (int col = lastRow; col >= row; col--) {
                System.out.print(" ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
