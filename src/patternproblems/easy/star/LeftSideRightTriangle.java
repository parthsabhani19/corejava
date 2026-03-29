package patternproblems.easy.star;

public class LeftSideRightTriangle {

    static void main() {
        int lastRow = 4;

        for (int row = 1; row <= lastRow; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
