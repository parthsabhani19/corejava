package controlflow.problems.basic;

public class PrimeNumber {
    static void main() {
        int number = 11;

        if(number <= 1) System.out.println("neither prime nor composite");

        boolean isPrime = true;

        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime ? "is prime" : "is not prime");
    }
}
