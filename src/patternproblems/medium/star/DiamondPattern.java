package patternproblems.medium.star;

public class DiamondPattern {
    static void main() {

        int lastRow = 4;
        for (int row = 1; row <= lastRow; row++) {
            for (int col = lastRow-1; col >= row; col--) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int row = 1; row <= lastRow-1; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" ");
            }

            for (int col = lastRow-1; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
