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
     * <p>
     * String is immutable
     * .concat() creates a new object, doesn’t modify old one
     */

    public static void immutability()
    {
        String firstName = "Parth";
        firstName.concat(" Sabhani");

        System.out.println("firstName: " + firstName); // still "Parth"
    }

    /**
     *
     * Why Immutability Matters?
     * <p>
     * Thread-safe (no synchronization needed)
     * Secure (used in passwords, tokens)
     * Memory efficient (String Pool)
     */

    /**
     *
     * String Pool (Memory Optimization)
     * Java stores strings in a special memory area inside heap
     */

    String nameOne = "Prince";
    String nameTwo = "Prince";  // both point to same object

    // but

    String nameThree = new String("Devam");
    String nameFour = new String("Devam"); // two different objects

    /**
     *
     * Pass by Value
     * Java is always pass-by-value
     *
     *
     */

    // original value not change
    void change(int x) {
        x = 50;
    }

    /**
     *
     * Wrapper Classes (Primitive → Object)
     * <p>
     * int -> Integer
     * double -> Double
     * char -> Character
     */

    Integer integer = 10; // Autoboxing
    int in = a; // Unboxing

    /**
     * Collections only work with objects
     * List<Integer> list = new ArrayList<>();
     */

    /**
     * var Keyword (Java 10+)
     * Compiler infers type
     */

     void varTest()
     {
         var name = "Krish";
     }
}

/**
 * Value changes because reference is passed by value
 * <p>
 * Note: Java passes a copy of the reference, not the object itself.
 */

/*
class User {
    int age;
}

void change(User u) {
    u.age = 30;
}
 */


/**
 * Variable Shadowing
 * Local variable overrides instance variable
 */

/*
class Test {
    int x = 10;

    void show() {
        int x = 20;
        System.out.println(x); // 20
        System.out.println(this.x); // 10 -> access instance variable
    }
}
 */
