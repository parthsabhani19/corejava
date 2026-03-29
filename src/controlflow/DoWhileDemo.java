package controlflow;

public class DoWhileDemo {

    /**
     * Executes at least once than checks the condition
     */

    static void main() {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }
}
