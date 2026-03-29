package patternproblems.easy.star;

public class LeftSideInvertedTriangle {

    static void main() {

        int lastRow = 5;
        for (int row = 1; row <= lastRow; row++) {
            for (int col = lastRow; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
