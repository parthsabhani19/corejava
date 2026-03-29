package controlflow;

public class ForLoopDemo {

    /**
     * Used when you know number of iterations
     */

    static void main() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }

        // enhanced for loop (for collections)

        int[] arr = {1, 2, 3};

        for (int num : arr) {
            System.out.println(num);
        }


    }
}
