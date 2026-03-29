package controlflow;

public class IfElseDemo {

    /**
     * Used to execute code based on condition
     * condition must return boolean
     */

    static void main() {
        int age = 20;

        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible");
        }

        // multiple if else

        if(age >= 18) {
            System.out.println("Eligible to vote");
        } else if (age >= 16) {
            System.out.println("Minor");
        }else {
            System.out.println("Not eligible");
        }

        // or we can use ternary for single if-else
        System.out.println(age >= 18 ? "Eligible to vote" : "Not eligible");
    }
}
