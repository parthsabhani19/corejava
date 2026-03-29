package controlflow.problems.basic;

public class ReverseANumber {

    static void main() {
        int number = 2387;
        int reversed = 0;

        while (number > 0) {
            int rem = number % 10;
            reversed = reversed * 10 + rem;
            number = number / 10;
        }
        System.out.println("Reversed number: " + reversed);
    }
}
