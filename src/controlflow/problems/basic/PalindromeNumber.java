package controlflow.problems.basic;

public class PalindromeNumber {

    static void main() {
        int number = 22;
        int storeNumber = number;
        int result = 0;

        if (number < 0) { System.out.println("Not a Palindrome"); return;}

        while (storeNumber > 0) {
            int remainder = storeNumber % 10;
            storeNumber = storeNumber / 10;
            result = result * 10 + remainder;
        }

        System.out.println(result == number ? "Number is Palindrome" : "Not a Palindrome");
    }
}
