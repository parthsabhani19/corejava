package coreconcept;

public class Operators {

    static void main() {
        arithmeticOperators();
        relationalOperators();
        logicalOperators();
        assignmentOperators();
        unaryOperators();
        ternaryOperator();
        bitwiseOperators();
        instanceofOperators();
    }

    /**
     * Arithmetic Operators
     * Relational Operators
     * Logical Operators
     * Assignment Operators
     * Unary Operators
     * Ternary Operator
     * Bitwise Operators (IMP)
     * instanceof Operator (IMP)
     */

    static void arithmeticOperators()
    {
        int a = 5;
        int b = 5;

        double value = 0;

        value = a + b;  // 15
        value = a - b;  // 5
        value = a * b;  // 50
        value = a / b; // 2
        value = a % b;  // 0
    }

    static void relationalOperators()
    {
        int a = 5;
        int b = 5;

        boolean value = false;

        value = a > b;   // true
        value = a < b;  // false
        value = a == b;  // false
        value = a != b;  // true
    }

    static void logicalOperators()
    {
        int a = 5;
        int b = 5;

        boolean value = false;

        value = true && false; // false: AND Logic
        value = true || false;  // true: OR Logic
        value = !true;          // false: NOT Logic
    }

    static void assignmentOperators()
    {
        int x = 10;
        x += 5;  // 15
        x -= 3;  // 12
    }

    static void unaryOperators()
    {
        int x = 5;

        x++; // 6
        ++x; // 7
    }

    static void ternaryOperator()
    {
        int a = 2;
        int b = 4;

        int result = (a > b) ? a : b; // cleaner alternative to if-else
    }

    static void bitwiseOperators()
    {
        int a = 5; // 101
        int b = 3; // 011

        int value = 0;

        value = a & b;  // 001 = 1
        value = a | b;  // 111 = 7
        value = a ^ b;  // 110 = 6
    }

    static void instanceofOperators()
    {
        String name = "Parth";

        if (name instanceof String) System.out.println("Name: " + name); // checks object type
    }
}
