package patternproblems.easy.star;

public class RightSideInvertedTriangle {

    static void main() {

        int lastRow = 5;

        for (int row = 1; row <= lastRow; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" ");
            }

            for (int col = lastRow; col >= row; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
