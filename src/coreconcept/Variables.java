package coreconcept;

public class Variables {

    static void main() {
        immutability();
    }

    /**
     *
     * What is a Variable ?
     * A variable is a named memory location used to store data that your program can read and modify.
     * <p>
     * A container
     * With a label (name)
     * Holding a value (data)
     * <p>
     * Basic Syntax :>
     * dataType variableName = value;
     */

    String name = "Parth"; // string: Non-primitive data-type

    int i = 12; // integer: primitive data-type (4 byte)
    long l = 400001; // long: primitive data-type (8 byte)

    float f = 44.10F; // float: primitive data-type (4 byte)
    double d = 12.40; // double: primitive data-type (8 byte)

    char c = 'p'; // character: primitive data-type (2 byte)
    boolean b = true; // boolean; primitive data-type (1 bit)

    /**
     *
     * Non-primitive data-type
     * These store reference (address), not actual value.
     * <p>
     * Value is stored in heap memory
     * Variable holds reference to that memory
     */

    int a = 10;          // stored in stack
    String lastname = "Sabhani"; // reference in stack, object in heap

    /**
     *
     * Heap vs Stack
     * <p>
     * Stack:
     * Stores - Primitive variables, References
     * Fast
     * Auto-managed
     * <p>
     * Heap:
     * Stores - Objects
     * Slower
     * Managed by Garbage Collector
     */

    /**
     *
     * Local Variable
     * Declared inside method
     * <p>
     * Only accessible inside method
     * Must be initialized before use
     */

    public void test() {
        int x = 10; // local variable for test method
    }

    /**
     *
     * Instance Variable
     * Declared inside class but outside method
     * <p>
     * Each object has its own copy
     * Stored in heap
     */

    int age;

    /**
     *
     * Static Variable (Class Variable)
     * <p>
     * Shared across all objects
     * Stored in method area
     */

    static String company = "Google";

    /**
     *
     * Default Values:
     * <p>
     * int = 0;
     * double = 0.0;
     * boolean = false;
     * String = null;
     * <p>
     * Note: Only for instance/static variables, NOT local
     */

    /**
     *
     * Final Keyword:
     * Value cannot change
     * Used for constants
     */

    final float pi = 3.14F;

    /**
     *
     * Type Casting:
     * Implicit (Automatic)
     * Explicit (Manual)
     */

    int num1 = 10;
    double dNum1 = a; // int → double (implicit)

    double dNum2 = 10.5;
    int num2 = (int) d; // double → int (explicit)

    /**
     *
     * Immutability
     * An immutable object cannot be changed after creation.
     */

    public static void immutability()
    {
        String firstName = "Parth";
        firstName.concat(" Sabhani");

        System.out.println("firstName: " + firstName); // still "Parth"
    }
}
