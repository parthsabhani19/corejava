package patternproblems.easy.numbers;

public class ContinuousNumbersPyramid {
    static void main() {

        int lastRow = 4;
        int number = 1;

        for (int row = 1; row <= lastRow; row++) {
            for (int col = lastRow-1; col >= row; col--) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
