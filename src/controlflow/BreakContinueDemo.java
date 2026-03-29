package controlflow;

public class BreakContinueDemo {

    /**
     * Break: terminate the loop
     * Continue: don't execute the next line, instead goes for the next in loop
     */

    static void main() {
        for (int i = 1; i <= 5; i++) {

            if (i == 3) continue; // skip 3
            if (i == 5) break;    // stop loop

            System.out.println(i);
        }
    }
}
