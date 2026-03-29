package patternproblems.easy.numbers;

public class LeftSideContinuousNumbers {

    static void main() {

        int lastRow = 5;
        int number = 1;
        for (int row = 1; row <= lastRow; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
